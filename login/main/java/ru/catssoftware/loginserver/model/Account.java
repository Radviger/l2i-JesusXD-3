package ru.catssoftware.loginserver.model;

// Generated 11 dec. 2006 17:28:16 by Hibernate Tools 3.2.0.beta8


/**
 * Accounts generated by hbm2java
 */
public class Account implements java.io.Serializable
{

	/**
	 *
	 */
	private static final long	serialVersionUID	= 6410734961032035356L;
	// Fields
	private String				login;
	private String				password;
	private long				lastactive;
	private Integer				accessLevel;
	private Integer				lastServerId		= 0;
	private String				lastIp;

	// Constructors

	/** default constructor */
	public Account()
	{
	}

	/** minimal constructor */
	public Account(String _login)
	{
		this.login = _login;
	}

	/** full constructor */
	public Account(String _login, String _password, int _accessLevel) {
		this(_login,_password,_accessLevel,0,-1,"");
	}
	public Account(String _login, String _password, long _lastactive, Integer _accessLevel, Integer _lastServerId, String _lastIp)
	{
		this.login = _login;
		this.password = _password;
		this.lastactive = _lastactive;
		this.accessLevel = _accessLevel;
		this.lastServerId = _lastServerId;
		this.lastIp = _lastIp;
	}

	// Property accessors
	public String getLogin()
	{
		return this.login;
	}

	public void setLogin(String _login)
	{
		this.login = _login;
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String _password)
	{
		this.password = _password;
	}

	public long getLastactive()
	{
		return this.lastactive;
	}

	public void setLastactive(long _lastactive)
	{
		this.lastactive = _lastactive;
	}

	public Integer getAccessLevel()
	{
		return this.accessLevel;
	}

	public void setAccessLevel(Integer _accessLevel)
	{
		this.accessLevel = _accessLevel;
	}

	public Integer getLastServerId()
	{
		return this.lastServerId;
	}

	public void setLastServerId(Integer _lastServerId)
	{
		this.lastServerId = _lastServerId;
	}

	public String getLastIp()
	{
		return this.lastIp;
	}

	public void setLastIp(String _lastIp)
	{
		this.lastIp = _lastIp;
	}
}
