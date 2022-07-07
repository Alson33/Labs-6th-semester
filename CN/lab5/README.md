## Lab - 5 [Network topology design using CISCO software]

### Objective

- Design a network topology using [CISCO software](https://www.cisco.com/)

### Theory

- Network topology is defined as the way of arranging different nodes/components of a computer network in different patterns to define the flow of data and resources.
- There are many types of topologies:
    1. **BUS topology:** In BUS topology all the computers are connected in a single line, failure in one node fails entire system, although it is easy to implement and maintain.
    2. **Ring topology:** In RING topology the computers are connected in a ring like pattern resolving the single direction flow of data in BUS topology although the failure of single node to failure of entire system still persists
    3. **STAR topology:** In Star toplogy we have a central server computer and all other computers are connected to that central computer, which means failure of one computer doesnot affect others unless it is the central computer itself.
    4. **TREE topology:** In TREE topology we hava a heirarchical parent-child like pattern, which is good for expanding the network, though it needs more wires and maintainence.
    5. **MESH topology:** In MESH topology all the computers are connected to each other which means failure in one computer doesnot affect system at all, though more wires are needed.
    6. **HYBRID topology:** In HYBRID topology we use more than one kind of topology which will bring the advantage of each topology though disadvantage of each topology will be present too. 

### Procedures

- We use the options in CISCO to create some computers and some routers
- We then connect the routers and computers with wires
- Configure the IP address and subnet mask of routers
- Configure the IP address and subnet mask of computers according to the connected routers
    - for example if `router1` has ip address `10.10.10.10` then the computers connected to it will be in port `10.10.10.11` and `10.10.10.12`, and so on.
- Check the connection from the computers command interface using `ping` command

### Output

![CISCO interface](https://scontent.fpkr1-1.fna.fbcdn.net/v/t1.6435-9/122150175_10164526754795717_4737560730905747665_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=9267fe&_nc_eui2=AeGRBoiZghXZH_wtX6YiBrsGO5D4cz5eYGE7kPhzPl5gYUqVWkpLwpOKOV4p5ksm6bzJFwHUnZEbFfgXH_xmy9Vn&_nc_ohc=BPwFdV8MR8oAX_2daQG&_nc_ht=scontent.fpkr1-1.fna&oh=00_AT_o4oRCsW3JFbDWnF07hpd1JZiT-Y0rwUcsdbNcq8m-bg&oe=62EE1638)