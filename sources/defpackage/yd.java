package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;

/* renamed from: yd  reason: default package */
public final class yd implements uuc {
    public final Context b;
    public final qra c;
    public final String d = "MAX";
    public final af7 e;
    public final khe f;

    public yd(Context context, qra qra, af7 af7) {
        this.b = context;
        this.c = qra;
        this.e = af7;
        this.f = new khe(new x5(7, this));
    }

    public final Uri c(vuc vuc, String str) {
        String d2 = vuc.d();
        int a = vuc.a();
        long currentTimeMillis = System.currentTimeMillis();
        File file = new File(d2, this.d);
        kpa kpa = new kpa("_display_name", str);
        kpa kpa2 = new kpa("mime_type", ey8.f(a));
        kpa kpa3 = new kpa("date_added", Long.valueOf(currentTimeMillis));
        kpa kpa4 = new kpa("date_modified", Long.valueOf(currentTimeMillis));
        String str2 = File.separator;
        kpa[] kpaArr = {kpa, kpa2, kpa3, kpa4, new kpa("relative_path", file + str2)};
        ContentValues contentValues = new ContentValues(5);
        for (int i = 0; i < 5; i++) {
            kpa kpa5 = kpaArr[i];
            String str3 = (String) kpa5.a;
            Object obj = kpa5.b;
            if (obj == null) {
                contentValues.putNull(str3);
            } else if (obj instanceof String) {
                contentValues.put(str3, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str3, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str3, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str3, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str3, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str3, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str3, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str3, (Byte) obj);
            } else if (obj instanceof Short) {
                contentValues.put(str3, (Short) obj);
            } else {
                String canonicalName = obj.getClass().getCanonicalName();
                throw new IllegalArgumentException("Illegal value type " + canonicalName + " for key \"" + str3 + '\"');
            }
        }
        Integer e2 = vuc.e();
        if (e2 != null) {
            contentValues.put("_size", Integer.valueOf(e2.intValue()));
        }
        Integer width = vuc.getWidth();
        if (width != null) {
            contentValues.put("width", Integer.valueOf(width.intValue()));
        }
        Integer height = vuc.getHeight();
        if (height != null) {
            contentValues.put("height", Integer.valueOf(height.intValue()));
        }
        contentValues.put("is_pending", 1);
        khe khe = this.f;
        Uri insert = ((ContentResolver) khe.getValue()).insert(vuc.c(), contentValues);
        if (insert == null) {
            return null;
        }
        vuc.b((ContentResolver) khe.getValue(), insert);
        contentValues.clear();
        contentValues.put("is_pending", 0);
        ((ContentResolver) khe.getValue()).update(insert, contentValues, (String) null, (String[]) null);
        Context context = this.b;
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(insert);
        intent.addFlags(1);
        try {
            context.sendBroadcast(intent);
        } catch (Exception e3) {
            tuc tuc = tuc.a;
            String str4 = tuc.b;
            hm9.p(str4, "sendBroadcastToGallery: failed for uri " + insert, e3);
        }
        return insert;
    }
}
