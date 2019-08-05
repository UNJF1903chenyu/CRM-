package snippet;

public class Snippet {
	#配置数据源（4个参数必须配：url,用户名username，密码password，驱动类driver，）
	spring.datasource.url = jdbc:mysql://localhost:3307/big_flight?serverTimezone=UTC
	spring.datasource.username = root
	spring.datasource.password = root
	#驱动
	spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
	
	#配置应用的名称和端口号
	server.servlet.context-path=/crm
	server.port=8080
	#配置MyBatis
	mybatis.config-location=classpath:mybatis-config.xml
	mybatis.mapper-locations=/mapperConfig/**/**.xml
	mybatis.type-aliases-
}

