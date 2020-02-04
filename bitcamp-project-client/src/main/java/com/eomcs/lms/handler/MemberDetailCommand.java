package com.eomcs.lms.handler;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.eomcs.lms.domain.Member;
import com.eomcs.lms.util.Prompt;

// "/member/detail 커멘드 실행
public class MemberDetailCommand implements Command {

    int index;
    ObjectOutputStream out;
    ObjectInputStream in;
    Prompt prompt;

    public MemberDetailCommand(ObjectOutputStream out, ObjectInputStream in,Prompt prompt) {
        this.out = out;
        this.in = in;
        this.prompt = prompt;
    }

    @Override
    public void execute() {
        try {
            int no = prompt.inputInt("번호 ?");

            out.writeUTF("/member/detail");
            out.writeInt(no);
            out.flush();

            String response = in.readUTF();
            if (response.equals("FAIL")) {
                System.out.println(in.readUTF());
                return;
            }
            if (index == -1) {
                System.out.println("해당 번호에 게시글이 없습니다.");
                return;
            }

            Member member = (Member) in.readObject();
            System.out.printf("번호: %s\n", member.getNo());
            System.out.printf("이름: %s\n", member.getName());
            System.out.printf("이메일: %s\n", member.getEmail());
            System.out.printf("암호: %s\n", member.getPassword());
            System.out.printf("사진: %s\n", member.getPhoto());
            System.out.printf("전화: %s\n", member.getTel());
        } catch (Exception e) {
            System.out.println("명령 실행 중 오류 발생!");
        }
    }
}
