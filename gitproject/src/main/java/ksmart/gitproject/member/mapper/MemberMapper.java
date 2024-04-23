package ksmart.gitproject.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import ksmart.gitproject.member.dto.Member;

@Mapper
public interface MemberMapper {
	List<Member> getMemberList();

}
