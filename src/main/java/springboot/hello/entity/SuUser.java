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
public class SuUser implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *用户名
         */
        // @Column(name="username")
         private String username;
         
        /**
         *密码
         */
        // @Column(name="password")
         private String password;
         
        /**
         *
         */
        // @Column(name="phoneNo")
         private String phoneNo;
         
        /**
         *
         */
        // @Column(name="qq")
         private String qq;
         
        /**
         *
         */
        // @Column(name="registTime")
         private Date registTime;
         
        /**
         *会员等级
         */
        // @Column(name="level")
         private Integer level;
         
        /**
         *积分
         */
        // @Column(name="score")
         private Integer score;
         

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }
        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }
        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }
        public Date getRegistTime() {
            return registTime;
        }

        public void setRegistTime(Date registTime) {
            this.registTime = registTime;
        }
        public Integer getLevel() {
            return level;
        }

        public void setLevel(Integer level) {
            this.level = level;
        }
        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }
}
