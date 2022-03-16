package com.socket.dto;

import java.util.Date;

public class Message {
		private String message;
		private String nickname;
		private Date date;
	 
		Message(){
			date = new Date();
	}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getNickname() {
			return nickname;
		}

		public void setNickname(String nickname) {
			this.nickname = nickname;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return "Message [message=" + message + ", nickname=" + nickname + ", date=" + date + "]";
	}
}
