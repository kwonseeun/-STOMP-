package com.socket.dto;

import java.util.LinkedList;
import java.util.Objects;

public class ChatingRoom {

		private String roomNumber;
		private String roomName;
		private LinkedList<String> users;
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ChatingRoom other = (ChatingRoom) obj;
			return Objects.equals(roomNumber, other.roomNumber);
		}
		@Override
		public int hashCode() {
			return Objects.hash(roomNumber);
		}
		public String getRoomNumber() {
			return roomNumber;
		}
		public void setRoomNumber(String roomNumber) {
			this.roomNumber = roomNumber;
		}
		public String getRoomName() {
			return roomName;
		}
		public void setRoomName(String roomName) {
			this.roomName = roomName;
		}
		public LinkedList<String> getUsers() {
			return users;
		}
		public void setUsers(LinkedList<String> users) {
			this.users = users;
		}
		@Override
		public String toString() {
			return "ChatingRoom [roomNumber=" + roomNumber + ", roomName=" + roomName + ", users=" + users + "]";
		}
		public ChatingRoom(String roomNumber, String roomName, LinkedList<String> users) {
			super();
			this.roomNumber = roomNumber;
			this.roomName = roomName;
			this.users = users;
		}
}
