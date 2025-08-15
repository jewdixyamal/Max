package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: nj0  reason: default package */
public abstract class nj0 implements q6b {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    public static Method b;

    public o43 a(Bitmap bitmap, s2b s2b) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        o43 c = s2b.c(width, height, config);
        try {
            d((Bitmap) c.e0(), bitmap);
            return c.m();
        } finally {
            o43.S(c);
        }
    }

    public void c(Bitmap bitmap) {
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) {
        Class<Bitmap> cls = Bitmap.class;
        if (!nu0.D0 || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
        } else {
            try {
                if (b == null) {
                    int i = Bitmaps.a;
                    b = Bitmaps.class.getDeclaredMethod("copyBitmap", new Class[]{cls, cls});
                }
                b.invoke((Object) null, new Object[]{bitmap, bitmap2});
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            }
        }
        c(bitmap);
    }

    public String getName() {
        return "Unknown postprocessor";
    }
}
