package springboot.hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public class SuLog implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *
         */
        // @Column(name="logType")
         private String logType;
         
        /**
         *
         */
        // @Column(name="accessPath")
         private String accessPath;
         
        /**
         *
         */
        // @Column(name="remoteIp")
         private String remoteIp;
         
        /**
         *
         */
        // @Column(name="createTime")
         private Date createTime;
         
        /**
         *
         */
        // @Column(name="userId")
         private Integer userId;
         

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getLogType() {
            return logType;
        }

        public void setLogType(String logType) {
            this.logType = logType;
        }
        public String getAccessPath() {
            return accessPath;
        }

        public void setAccessPath(String accessPath) {
            this.accessPath = accessPath;
        }
        public String getRemoteIp() {
            return remoteIp;
        }

        public void setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }
        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }
}
