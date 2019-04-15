package springboot.hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import springboot.hello.entity.base.BaseEntity;


/**
* Created by hbm Generator<27683139@qq.com> on 2019-4-14.
*/
public class BsAlbum extends BaseEntity implements Serializable {
        /**
         *
         */
         @Id
   		 @GeneratedValue(generator = "JDBC")
         private Integer id; 
         
        /**
         *
         */
        // @Column(name="albumName")
         private String albumName;
         
        /**
         *封面图片id
         */
        // @Column(name="albumCoverId")
         private Integer albumCoverId;
         
        /**
         *
         */
        // @Column(name="uploadTime")
         private Date uploadTime;
         
        /**
         *1可用 0 不可用
         */
        // @Column(name="useFlag")
         private Integer useFlag;
         
        /**
         *上传用户id
         */
        // @Column(name="uploadUser")
         private Integer uploadUser;
         
        /**
         *
         */
        // @Column(name="tagId")
         private Integer tagId;
         
         private String tagname;
         

        public String getTagname() {
			return tagname;
		}

		public void setTagname(String tagname) {
			this.tagname = tagname;
		}

		public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }
        public Integer getAlbumCoverId() {
            return albumCoverId;
        }

        public void setAlbumCoverId(Integer albumCoverId) {
            this.albumCoverId = albumCoverId;
        }
        public Date getUploadTime() {
            return uploadTime;
        }

        public void setUploadTime(Date uploadTime) {
            this.uploadTime = uploadTime;
        }
        public Integer getUseFlag() {
            return useFlag;
        }

        public void setUseFlag(Integer useFlag) {
            this.useFlag = useFlag;
        }
        public Integer getUploadUser() {
            return uploadUser;
        }

        public void setUploadUser(Integer uploadUser) {
            this.uploadUser = uploadUser;
        }
        public Integer getTagId() {
            return tagId;
        }

        public void setTagId(Integer tagId) {
            this.tagId = tagId;
        }
}
