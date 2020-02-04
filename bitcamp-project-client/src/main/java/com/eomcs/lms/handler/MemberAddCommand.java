package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;

import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Prompt;

// "/member/add" 커멘드 실행
public class MemberAddCommand implements Command {

    ObjectOutputStream out;
    ObjectInputStream in;
    Prompt prompt;

    public MemberAddCommand(ObjectOutputStream out, ObjectInputStream in,Prompt prompt) {
        this.out = out;
        this.in = in;
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        try {
            Member member = new Member();

            member.setNo(prompt.inputInt("번호? "));
            member.setName(prompt.inputString("이름? "));
            member.setEmail(prompt.inputString("이메일? "));
            member.setPassword(prompt.inputString("암호? "));
            member.setPhoto(prompt.inputString("사진? "));
            member.setTel(prompt.inputString("전화? "));
            member.setRegisteredDate(new Date(System.currentTimeMillis()));

            out.writeUTF("/member/add");
            out.writeObject(member);
            out.flush();

            String response = in.readUTF();
            if (response.equals("FAIL")) {
                System.out.println(in.readUTF());
                return;
            }
        } catch (Exception e) {
            System.out.println("통신 오류 발생!");
        }
    } 
}
