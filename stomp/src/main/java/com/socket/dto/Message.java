package com.socket.dto;

import java.util.Date;
import java.util.Objects;

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

		@Override
		public int hashCode() {
			return Objects.hash(date, message, nickname);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Message other = (Message) obj;
			return Objects.equals(date, other.date) && Objects.equals(message, other.message)
					&& Objects.equals(nickname, other.nickname);
		}
}
