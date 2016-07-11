package com.ningl.emojicomment.emoji;

import android.content.Context;
import android.util.SparseArray;

import java.io.IOException;
import java.io.InputStream;

/**
 * emoji数据抽象类
 * Created by ningl on 16/7/12.
 */
public abstract class AbsEmoji {

    private InputStream is;

    public abstract SparseArray<Emoji> createEmoji();

    public SparseArray<Emoji> getline(Context context, String fileName){
        getEmojiInputStream(context, fileName);
        String str;
        //TODO 读取文本映射数据
        return null;
    }

    public InputStream getEmojiInputStream(Context context, String fileName){
        if(is == null){
            try {
                is = context.getAssets().open(fileName);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return is;
    }

}
