package com.kstech.model;

public class Msg {
    @Override
	public String toString() {
		return "Msg [msgId=" + msgId + ", refname=" + refname + ", content="
				+ content + "]";
	}
    //��Ӧ���ݿ���msgID 
	private Integer msgId;

	//����msg ��contentʱ������ ��ʽ  fmi10
    private String refname;

    private String content;
    
    

    public Msg() {
	}

	public Msg(String refname, String content) {
		super();
		this.refname = refname;
		this.content = content;
	}

	public Integer getMsgId() {
        return msgId;
    }

    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }

    public String getRefname() {
        return refname;
    }

    public void setRefname(String refname) {
        this.refname = refname == null ? null : refname.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}