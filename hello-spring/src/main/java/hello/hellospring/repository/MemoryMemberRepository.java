package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

  private static Map<Long, Member> store = new HashMap<>();
  private static long sequence = 0L;  // 키 값 생성


  @Override
  public Member save(Member member) {
    member.setId(++sequence);
    store.put(member.getId(), member);
    return member;
  }

  @Override
  public Optional<Member> findById(Long id) {
    return Optional.ofNullable(store.get(id));
    // null이 반환될 가능성이 있으면 Optional.ofNullable 사용
    // null이어도 감쌀 수 있음
  }

  @Override
  public Optional<Member> findByName(String name) {
    return store.values().stream()  // loop로 돌림
            .filter(member -> member.getName().equals(name))  // member.getName()이 parameter로 넘어온 name과 같은지 확인
            .findAny(); // 조건에 일치하는 요소 하나 찾으면 반환
  }

  @Override
  public List<Member> findAll() {
    return new ArrayList<>(store.values());
  }

  public void clearStore() {
    store.clear();
  }
}
