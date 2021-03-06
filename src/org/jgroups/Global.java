package org.jgroups;

import org.jgroups.conf.ClassConfigurator;
import org.jgroups.protocols.SCOPE;

/**
 * Globals used by JGroups packages.
 * 
 * @author Bela Ban Mar 29, 2004
 */
public class Global {
    public static final int BYTE_SIZE   = Byte.SIZE    / 8; // 1
    public static final int SHORT_SIZE  = Short.SIZE   / 8; // 2
    public static final int INT_SIZE    = Integer.SIZE / 8; // 4
    public static final int LONG_SIZE   = Long.SIZE    / 8; // 8
    public static final int DOUBLE_SIZE = Double.SIZE  / 8; // 8;
    public static final int FLOAT_SIZE  = Float.SIZE   / 8; // 4;

    public static final int MAX_DATAGRAM_PACKET_SIZE=1 << 16;

    public static final Object NULL=new Object();

    public static final short SCOPE_ID=ClassConfigurator.getProtocolId(SCOPE.class);

    public static final String IPv4="java.net.preferIPv4Stack";
    public static final String IPv6="java.net.preferIPv6Addresses";

    public static final String NON_LOOPBACK_ADDRESS="NON_LOOPBACK_ADDRESS";


    public static final String BIND_ADDR="jgroups.bind_addr";
    public static final String BIND_INTERFACE="jgroups.bind_interface";
    public static final String IGNORE_BIND_ADDRESS_PROPERTY="jgroups.ignore.bind_addr";

    public static final String TCPPING_INITIAL_HOSTS="jgroups.tcpping.initial_hosts";

    public static final String UDP_MCAST_ADDR="jgroups.udp.mcast_addr";
    public static final String UDP_MCAST_PORT="jgroups.udp.mcast_port";
    public static final String UDP_IP_TTL="jgroups.udp.ip_ttl";

    public static final String MPING_MCAST_ADDR="jgroups.mping.mcast_addr";
    public static final String MPING_MCAST_PORT="jgroups.mping.mcast_port";
    public static final String MPING_IP_TTL="jgroups.mping.ip_ttl";

    public static final String BPING_BIND_PORT="jgroups.bping.bind_port";

    public static final String STOMP_BIND_ADDR="jgroups.stomp.bind_addr";
    public static final String STOMP_ENDPOINT_ADDR="jgroups.stomp.endpoint_addr";

    public static final String MAGIC_NUMBER_FILE="jgroups.conf.magic_number_file";
    public static final String PROTOCOL_ID_FILE="jgroups.conf.protocol_id_file";
    public static final String RESOLVE_DNS="jgroups.resolve_dns";
    public static final String PRINT_UUIDS="jgroups.print_uuids";
    public static final String UUID_CACHE_MAX_ELEMENTS="jgroups.uuid_cache.max_elements";
    public static final String UUID_CACHE_MAX_AGE="jgroups.uuid_cache.max_age";

    public static final String IPV6_MCAST_PREFIX="jgroups.ipmcast.prefix";

    public static final String TIMER_NUM_THREADS="jgroups.timer.num_threads";

    public static final String USE_JDK_LOGGER="jgroups.use.jdk_logger"; // forces use of the JDK logger
    public static final String CUSTOM_LOG_FACTORY="jgroups.logging.log_factory_class";

    public static final long   DEFAULT_FIRST_UNICAST_SEQNO = 1;

    /** First ID assigned for building blocks (defined in jg-protocols.xml) */
    public static final short  BLOCKS_START_ID=200;
    
    public static final String SINGLETON_NAME="singleton_name";
    
    public static final long   THREADPOOL_SHUTDOWN_WAIT_TIME=3000;
    public static final long   THREAD_SHUTDOWN_WAIT_TIME=300;
    public static final String DUMMY="dummy-";

    public static final String PREFIX="org.jgroups.protocols.";
    
    public static final String XML_VALIDATION="jgroups.xml.validation";

    // for TestNG
    public static final String FUNCTIONAL="functional";
    public static final String TIME_SENSITIVE="time-sensitive";
    public static final String STACK_DEPENDENT="stack-dependent";
    public static final String STACK_INDEPENDENT="stack-independent";
    public static final String GOSSIP_ROUTER="gossip-router";
    public static final String FLUSH="flush";
    public static final String INITIAL_MCAST_ADDR="INITIAL_MCAST_ADDR";
    public static final String INITIAL_MCAST_PORT="INITIAL_MCAST_PORT";
    public static final String INITIAL_TCP_PORT="INITIAL_TCP_PORT";

    public static final String UDP_MCAST_SOCK="jgroups.udp.mcast_sock";
    public static final String UDP_UCAST_SOCK="jgroups.udp.unicast_sock";
    public static final String TCP_SRV_SOCK="jgroups.tcp.srv_sock";
    public static final String TCP_SOCK="jgroups.tcp.sock";
    public static final String TUNNEL_UCAST_SOCK="jgroups.tunnel.ucast_sock";
    public static final String MPING_MCAST_SOCK="jgroups.mping.mcast_sock";
    public static final String BPING_SOCK="jgroups.bping.sock";
    public static final String TP_DIAG_MCAST_SOCK="jgroups.tp.diag.mcast_sock";
    public static final String STREAMING_STATE_TRANSFER_SERVER_SOCK="jgroups.streaming_state_transfer.srv_sock";
    public static final String FD_SOCK_SRV_SOCK="jgroups.fd_sock.srv_sock";
    public static final String BSH_SRV_SOCK="jgroups.bsh.srv_sock";
    public static final String STOMP_SRV_SOCK="jgroups.stomp.srv_sock";

    public static final String CCHM_INITIAL_CAPACITY="cchm.initial_capacity";
    public static final String CCHM_LOAD_FACTOR="cchm.load_factor";
    public static final String CCHM_CONCURRENCY_LEVEL="cchm.concurrency_level";

    public static final int IPV4_SIZE=4;
    public static final int IPV6_SIZE=16;


    public static final int SMALL_CLUSTER_SIZE=10;
    public static final int NORMAL_CLUSTER_SIZE=20;
    public static final int BIG_CLUSTER_SIZE=100;



    public static boolean getPropertyAsBoolean(String property, boolean defaultValue) {
        boolean result = defaultValue;
        try{
            String tmp = System.getProperty(property);
            if(tmp != null)
                result = Boolean.parseBoolean(tmp);
        }
        catch(Throwable t) {
        }
        return result;
    }

    public static long getPropertyAsLong(String property, long defaultValue) {
        long result = defaultValue;
        try{
            String tmp = System.getProperty(property);
            if(tmp != null)
                result = Long.parseLong(tmp);
        }
        catch(Throwable t){
        }
        return result;
    }

    public static int getPropertyAsInteger(String property, int defaultValue) {
        int result = defaultValue;
        try{
            String tmp = System.getProperty(property);
            if(tmp != null)
                result = Integer.parseInt(tmp);
        }
        catch(Throwable t){
        }
        return result;
    }
}
