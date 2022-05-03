package com.company.project.model;

import javax.persistence.*;

public class File {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 相对路径
     */
    private String path;

    /**
     * 文件名
     */
    private String name;

    /**
     * 后缀
     */
    private String suffix;

    /**
     * 大小|字节B
     */
    private Long size;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Long createdAt;

    /**
     * 修改时间
     */
    @Column(name = "updated_at")
    private Long updatedAt;

    /**
     * 已上传分片
     */
    @Column(name = "shard_index")
    private Long shardIndex;

    /**
     * 分片大小|B
     */
    @Column(name = "shard_size")
    private Long shardSize;

    /**
     * 分片总数
     */
    @Column(name = "shard_total")
    private Long shardTotal;

    /**
     * 文件标识
     */
    @Column(name = "file_key")
    private String fileKey;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取相对路径
     *
     * @return path - 相对路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置相对路径
     *
     * @param path 相对路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取文件名
     *
     * @return name - 文件名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名
     *
     * @param name 文件名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取后缀
     *
     * @return suffix - 后缀
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * 设置后缀
     *
     * @param suffix 后缀
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    /**
     * 获取大小|字节B
     *
     * @return size - 大小|字节B
     */
    public Long getSize() {
        return size;
    }

    /**
     * 设置大小|字节B
     *
     * @param size 大小|字节B
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取修改时间
     *
     * @return updated_at - 修改时间
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置修改时间
     *
     * @param updatedAt 修改时间
     */
    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取已上传分片
     *
     * @return shard_index - 已上传分片
     */
    public Long getShardIndex() {
        return shardIndex;
    }

    /**
     * 设置已上传分片
     *
     * @param shardIndex 已上传分片
     */
    public void setShardIndex(Long shardIndex) {
        this.shardIndex = shardIndex;
    }

    /**
     * 获取分片大小|B
     *
     * @return shard_size - 分片大小|B
     */
    public Long getShardSize() {
        return shardSize;
    }

    /**
     * 设置分片大小|B
     *
     * @param shardSize 分片大小|B
     */
    public void setShardSize(Long shardSize) {
        this.shardSize = shardSize;
    }

    /**
     * 获取分片总数
     *
     * @return shard_total - 分片总数
     */
    public Long getShardTotal() {
        return shardTotal;
    }

    /**
     * 设置分片总数
     *
     * @param shardTotal 分片总数
     */
    public void setShardTotal(Long shardTotal) {
        this.shardTotal = shardTotal;
    }

    /**
     * 获取文件标识
     *
     * @return file_key - 文件标识
     */
    public String getFileKey() {
        return fileKey;
    }

    /**
     * 设置文件标识
     *
     * @param fileKey 文件标识
     */
    public void setFileKey(String fileKey) {
        this.fileKey = fileKey;
    }
}