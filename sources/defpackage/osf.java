package defpackage;

import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: osf  reason: default package */
public enum osf {
    URL(3, "url"),
    FOLDER(4, "folder"),
    INLINE_BUTTON(5, "inline_button"),
    FROM_NOTIFICATION(MultiFileUploader.MSG_TRY_UPLOAD_NEXT, "from_notification"),
    FROM_SEARCH(1003, "from_search");
    
    public static final b46 c = null;
    public final String a;
    public final int b;

    /* JADX WARNING: type inference failed for: r0v2, types: [b46, java.lang.Object] */
    static {
        osf[] osfArr;
        u0 = new v25(osfArr);
        c = new Object();
    }

    /* access modifiers changed from: public */
    osf(int i, String str) {
        this.a = str;
        this.b = i;
    }
}
