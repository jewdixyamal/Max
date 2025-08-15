package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mp4  reason: default package */
public final class mp4 {
    public static final /* synthetic */ bc7[] f;
    public static final String g;
    public final ztc a;
    public final rm4 b;
    public final rm4 c;
    public final rm4 d;
    public final AtomicBoolean e = new AtomicBoolean();

    static {
        Class<mp4> cls = mp4.class;
        hob hob = new hob(cls, "authStorage", "getAuthStorage()Lru/ok/tamtam/AuthStorage;", 0);
        oec oec = nec.a;
        f = new bc7[]{hob, zr6.e(oec, cls, "fileAttachUploader", "getFileAttachUploader()Lru/ok/tamtam/FileAttachUploader;", 0), zr6.f(cls, "draftUploadsRepository", "getDraftUploadsRepository()Lru/ok/tamtam/upload/drafts/DraftUploadsRepository;", 0, oec)};
        g = cls.getName();
    }

    public mp4(ztc ztc, rm4 rm4, rm4 rm42, rm4 rm43) {
        this.a = ztc;
        this.b = rm42;
        this.c = rm4;
        this.d = rm43;
    }
}
