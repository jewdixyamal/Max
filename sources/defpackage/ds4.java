package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: ds4  reason: default package */
public abstract class ds4 {
    public static final Field a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        a = field;
    }
}
