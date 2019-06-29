#There is error when i am trying to run this class find port issue as per below

javax.mail.MessagingException: Could not connect to SMTP host: localhost, port: 1961;
  nested exception is:
	java.net.ConnectException: Connection refused: connect
	at com.sun.mail.smtp.SMTPTransport.openServer(SMTPTransport.java:1961)
	at com.sun.mail.smtp.SMTPTransport.protocolConnect(SMTPTransport.java:654)
	at javax.mail.Service.connect(Service.java:295)
	at javax.mail.Service.connect(Service.java:176)
	at javax.mail.Service.connect(Service.java:125)
	at javax.mail.Transport.send0(Transport.java:194)
	at javax.mail.Transport.send(Transport.java:124)
	at com.email.send.SendEmail.main(SendEmail.java:58)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
	at java.net.PlainSocketImpl.connect(Unknown Source)
	at java.net.SocksSocketImpl.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at com.sun.mail.util.SocketFetcher.createSocket(SocketFetcher.java:321)
	at com.sun.mail.util.SocketFetcher.getSocket(SocketFetcher.java:237)
	at com.sun.mail.smtp.SMTPTransport.openServer(SMTPTransport.java:1927)
	... 7 more
