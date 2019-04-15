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
public class BsPicAlbum implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *
         */
        // @Column(name="picId")
         private Integer picId;
         
        /**
         *
         */
        // @Column(name="albumId")
         private Integer albumId;
         

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public Integer getPicId() {
            return picId;
        }

        public void setPicId(Integer picId) {
            this.picId = picId;
        }
        public Integer getAlbumId() {
            return albumId;
        }

        public void setAlbumId(Integer albumId) {
            this.albumId = albumId;
        }
}
