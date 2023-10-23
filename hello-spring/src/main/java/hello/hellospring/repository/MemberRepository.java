package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
	
	Member save(Member member);
	Optional<Member> findById(Long id); //optional로 널값을 감싸서 리턴하는방식 
	Optional<Member> findByName(String name);
	List<Member> findAll();
	
}
