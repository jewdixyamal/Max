package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: ap7  reason: default package */
public final class ap7 extends jp7 implements nte {
    public static final String[] d = {"_id", "_data"};
    public static final String[] e = {"_data"};
    public static final Rect f = new Rect(0, 0, 512, 384);
    public static final Rect g = new Rect(0, 0, 96, 96);
    public final ContentResolver c;

    public ap7(Executor executor, y7g y7g, ContentResolver contentResolver) {
        super(executor, y7g);
        this.c = contentResolver;
    }

    public final boolean b(jic jic) {
        Rect rect = f;
        return tu0.p(rect.width(), rect.height(), jic);
    }

    public final g05 d(wv6 wv6) {
        jic jic;
        Cursor query;
        g05 f2;
        String string;
        int i;
        Uri uri = wv6.b;
        if (!e9f.d(uri) || (jic = wv6.i) == null || (query = this.c.query(uri, d, (String) null, (String[]) null, (String) null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (f2 = f(jic, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                string = query.getString(columnIndex);
                if (string != null) {
                    i = oag.q(new ExifInterface(string).getAttributeInt("Orientation", 1));
                    f2.o = i;
                }
                i = 0;
                f2.o = i;
            }
            query.close();
            return f2;
        } catch (IOException e2) {
            Class<ap7> cls = ap7.class;
            if (ta5.a.i(6)) {
                ta5.a.e(cls.getSimpleName(), "Unable to retrieve thumbnail rotation for ".concat(string), e2);
            }
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    public final String e() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final g05 f(jic jic, long j) {
        int i;
        Cursor queryMiniThumbnail;
        int columnIndex;
        Rect rect = g;
        if (tu0.p(rect.width(), rect.height(), jic)) {
            i = 3;
        } else {
            Rect rect2 = f;
            i = tu0.p(rect2.width(), rect2.height(), jic) ? 1 : 0;
        }
        if (i == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, j, i, e)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String string = queryMiniThumbnail.getString(columnIndex);
                string.getClass();
                if (new File(string).exists()) {
                    return c(new FileInputStream(string), (int) new File(string).length());
                }
            }
            queryMiniThumbnail.close();
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }
}
