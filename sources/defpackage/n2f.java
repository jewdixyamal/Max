package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;
import org.apache.http.util.LangUtils;
import ru.ok.messages.video.widgets.VideoPlayerSeekBarPreview;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: n2f  reason: default package */
public final /* synthetic */ class n2f implements cc3, qa5, ra5, qj3, b7b, b66 {
    public final /* synthetic */ int a;

    public /* synthetic */ n2f(int i) {
        this.a = i;
    }

    public ka5[] a() {
        switch (this.a) {
            case 2:
                return new ka5[]{new h3f()};
            default:
                return new ka5[]{new zrf()};
        }
    }

    public void accept(Object obj) {
        d20 d20 = d20.o;
        switch (this.a) {
            case 4:
                hm9.p("c7f", "clear: failed to clear uploads repository", (Throwable) obj);
                return;
            case 5:
                hm9.m("c7f", "getUploadFromRepository: found upload in cache, upload=%s", (v6f) obj);
                return;
            case 6:
                hm9.p("c7f", "getUploadFromRepository: failed to get upload from cache", (Throwable) obj);
                return;
            case 8:
                ((j10) obj).i = d20;
                return;
            case 16:
                hm9.p("wef", "clear: failed", (Throwable) obj);
                return;
            case LangUtils.HASH_SEED /*17*/:
                hm9.m("wef", "convertObs: progress %f", (Float) obj);
                return;
            case 18:
                hm9.m("wef", "convertVideo: loaded from storage = %s", (kef) obj);
                return;
            case 22:
                j10 j10 = (j10) obj;
                if (j10.c().g || !oag.t(j10.c().h)) {
                    d20 = d20.a;
                }
                j10.i = d20;
                return;
            default:
                Throwable th = (Throwable) obj;
                int i = VideoPlayerSeekBarPreview.E0;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, w36] */
    public Object apply(Object obj) {
        switch (this.a) {
            case 10:
                ((e52) obj).b.f0.getClass();
                return nz4.a;
            case 11:
                return new File((String) obj);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                w8f w8f = (w8f) obj;
                w8f.getClass();
                return new sa3(2, new ia4(14, w8f));
            case 13:
                return xfg.u((e7f) obj);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((OneMeRoomDatabase) obj).U();
            case 19:
                qef qef = (qef) obj;
                qef.getClass();
                return new sa3(2, new ia4(15, qef));
            case 20:
                nef nef = (nef) obj;
                lef lef = null;
                if (nef == null) {
                    return null;
                }
                ? obj2 = new Object();
                mef mef = nef.a;
                if (mef != null) {
                    i20 i20 = new i20(1);
                    i20.a = mef.b;
                    i20.b = mef.c;
                    i20.c = mef.d;
                    i20.d = mef.e;
                    ref ref = new ref(i20);
                    l7b l7b = new l7b(13, false);
                    l7b.b = mef.a;
                    l7b.c = ref;
                    lef = new lef(l7b);
                }
                obj2.b = lef;
                obj2.c = nef.c;
                obj2.o = nef.d;
                obj2.a = nef.b;
                return new kef(obj2);
            case 21:
                return ((OneMeRoomDatabase) obj).V();
            default:
                return ((pk0) obj).a();
        }
    }

    public Object f(bg4 bg4) {
        switch (this.a) {
            case 0:
                return o2f.b((Context) bg4.a(Context.class));
            default:
                return o2f.b((Context) bg4.a(Context.class));
        }
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 7:
                return ((v6f) obj).a();
            default:
                return ((e52) obj).b.f0 != null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public la5[] m42a() {
        switch (this.a) {
            case 3:
                kj6 kj6 = mbe.a0;
                tue tue = new tue(0);
                ls5 ls5 = zw6.b;
                return new la5[]{new i3f(1, 1, kj6, tue, new df4(ffc.X, 0, 1))};
            default:
                return new la5[]{new asf()};
        }
    }
}
