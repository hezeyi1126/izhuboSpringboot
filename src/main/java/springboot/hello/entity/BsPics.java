package springboot.hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import springboot.hello.entity.base.BaseEntity;


/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-13.
*/
public class BsPics extends BaseEntity implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *
         */
        // @Column(name="albumId")
         private Integer albumId;
         
        /**
         *
         */
        // @Column(name="path")
         private String path;
         
        /**
         *是否vip专属 1是 0不是
         */
        // @Column(name="isVip")
         private Integer isVip;
         

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public Integer getAlbumId() {
            return albumId;
        }

        public void setAlbumId(Integer albumId) {
            this.albumId = albumId;
        }
        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
        public Integer getIsVip() {
            return isVip;
        }

        public void setIsVip(Integer isVip) {
            this.isVip = isVip;
        }
}
