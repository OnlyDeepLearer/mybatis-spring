# mybatis-spring
```
    <!--  Dynamic SQL Examples  -->
    <select id="findActiveBlogLikeWithIf" resultType="uz.dk.mybatis.user.User">
        SELECT * FROM BLOG WHERE state = 'ACTIVE'
        <if test="title != null">
            AND title like #{title}
        </if>
        <if test="author != null and author.name != null">
            AND author_name like #{author.name}
        </if>
    </select>

    <select id="findActiveBlogLikeWithSwitch" resultType="uz.dk.mybatis.user.User">
        SELECT * FROM BLOG WHERE state = 'ACTIVE'
        <choose>
            <when test="title != null">
                AND title like #{title}
            </when>
            <when test="author != null and author.name != null">
                AND author_name like #{author.name}
            </when>
            <otherwise>
                AND featured = 1
            </otherwise>
        </choose>
    </select>
    ```
