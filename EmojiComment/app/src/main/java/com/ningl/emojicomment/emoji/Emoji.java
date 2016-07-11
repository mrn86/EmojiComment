package com.ningl.emojicomment.emoji;

/**
 * Emoji 表情bean
 * Created by ningl on 16/7/12.
 */
public class Emoji {

    //图片资源id
    private int resourceId;
    //unicode
    private int unicode;

    private String defaultEmoji;

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public int getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
    }

    public void getDefultEmoji(){
        defaultEmoji = getDefultEmoji(unicode);
    }

    public String getDefultEmoji(int unicode){
        return new String(Character.toChars(unicode));
    }

}
