package springboot.hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
public class BsTag implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *
         */
        // @Column(name="tagname")
         private String tagname;
         

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getTagname() {
            return tagname;
        }

        public void setTagname(String tagname) {
            this.tagname = tagname;
        }
}
