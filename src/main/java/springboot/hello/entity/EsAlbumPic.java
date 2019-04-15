package springboot.hello.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
* Created by hbm Generator<27683139@qq.com> on 2018-12-27.
*/
public class EsAlbumPic implements Serializable {
        /**
         *图片资源id
         */
        // @Column(name="albumPicId")
         private Integer albumPicId;
         
        /**
         *相册id
         */
        // @Column(name="albumId")
         private Integer albumId;
         
        /**
         *图片资源url
         */
        // @Column(name="albumPicUrl")
         private String albumPicUrl;
         
        /**
         *是否删除标识：1-未删除，0-已删除
         */
        // @Column(name="albumPicDelFlag")
         private String albumPicDelFlag;
         
        /**
         *图片资源名称
         */
        // @Column(name="albumPicName")
         private String albumPicName;
         
        /**
         *图片大小
         */
        // @Column(name="albumPicSize")
         private BigDecimal albumPicSize;
         
        /**
         *图片尺寸
         */
        // @Column(name="albumWH")
         private String albumWH;
         
        /**
         *图片类型
         */
        // @Column(name="picType")
         private String picType;
         
        /**
         *店铺id
         */
        // @Column(name="shopId")
         private Integer shopId;
         
        /**
         *创建时间
         */
        // @Column(name="createTime")
         private Date createTime;
         

        public Integer getAlbumPicId() {
            return albumPicId;
        }

        public void setAlbumPicId(Integer albumPicId) {
            this.albumPicId = albumPicId;
        }
        public Integer getAlbumId() {
            return albumId;
        }

        public void setAlbumId(Integer albumId) {
            this.albumId = albumId;
        }
        public String getAlbumPicUrl() {
            return albumPicUrl;
        }

        public void setAlbumPicUrl(String albumPicUrl) {
            this.albumPicUrl = albumPicUrl;
        }
        public String getAlbumPicDelFlag() {
            return albumPicDelFlag;
        }

        public void setAlbumPicDelFlag(String albumPicDelFlag) {
            this.albumPicDelFlag = albumPicDelFlag;
        }
        public String getAlbumPicName() {
            return albumPicName;
        }

        public void setAlbumPicName(String albumPicName) {
            this.albumPicName = albumPicName;
        }
        public BigDecimal getAlbumPicSize() {
            return albumPicSize;
        }

        public void setAlbumPicSize(BigDecimal albumPicSize) {
            this.albumPicSize = albumPicSize;
        }
        public String getAlbumWH() {
            return albumWH;
        }

        public void setAlbumWH(String albumWH) {
            this.albumWH = albumWH;
        }
        public String getPicType() {
            return picType;
        }

        public void setPicType(String picType) {
            this.picType = picType;
        }
        public Integer getShopId() {
            return shopId;
        }

        public void setShopId(Integer shopId) {
            this.shopId = shopId;
        }
        public Date getCreateTime() {
            return createTime;
        }

        public void setCreateTime(Date createTime) {
            this.createTime = createTime;
        }
}
