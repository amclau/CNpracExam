import socket

sock=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)

udp_name=socket.gethostname()
udp_port=12345

while(True):
    inp=input("Enter msg:")
    sock.sendto(inp.encode('utf-8'),(udp_name,udp_port))