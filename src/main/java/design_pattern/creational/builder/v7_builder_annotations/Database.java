package design_pattern.creational.builder.v7_builder_annotations;

import design_pattern.creational.builder.DataBaseType;
import lombok.Builder;

@Builder
public class Database {

	private String name;

	private String password;

	private String userName;

	private int port;

	private DataBaseType type;

	private Boolean isCompressed;

	@Override
	public String toString() {
		return "Database [name=" + name + ", password=" + password + ", userName=" + userName + ", port=" + port
				+ ", type=" + type + ", isCompressed=" + isCompressed + "]";
	}
	
	

}
