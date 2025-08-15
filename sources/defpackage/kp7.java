package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: kp7  reason: default package */
public final /* synthetic */ class kp7 implements qj3, b7b, b66, za7, bw7, pl0, m88, n88, km7, fa8 {
    public final /* synthetic */ int a;

    public /* synthetic */ kp7(int i) {
        this.a = i;
    }

    public int a(Object obj) {
        switch (this.a) {
            case 18:
                String str = ((x78) obj).a;
                if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
                    return 1;
                }
                return (maf.a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 19:
                String str2 = ((y78) obj).a;
                if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                    return 1;
                }
                return (oaf.a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
            case 20:
                return ((x78) obj).a.startsWith("OMX.google") ? 1 : 0;
            default:
                return ((y78) obj).a.startsWith("OMX.google") ? 1 : 0;
        }
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.a) {
            case 0:
                hm9.p("lp7", "Can't load frames", th);
                return;
            default:
                hm9.p("yx7", "Got error on chat invalidation", th);
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return obj.toString();
            case 5:
                return ((upb) obj).c;
            case 6:
                hm9.p("yx7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 7:
                hm9.p("yx7", "searchChatsAndMessage: search server messages exception", (Throwable) obj);
                return Collections.emptyList();
            case 8:
                return new xx7(wx7.c, (List) obj);
            case 9:
                hm9.p("yx7", "searchChatsAndMessage: search local chats exception", (Throwable) obj);
                return Collections.emptyList();
            case 10:
                return new xx7(wx7.a, (List) obj);
            default:
                List<vpb> list = (List) obj;
                wx7 wx7 = wx7.b;
                ArrayList arrayList = new ArrayList(list.size());
                for (vpb vpb : list) {
                    try {
                        arrayList.add(new kzc(5, (String) null, vpb.b, (e52) null, (uj3) null, (fs8) null, 0, vpb));
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                return new xx7(wx7, arrayList);
        }
    }

    public Object b() {
        switch (this.a) {
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return new h08();
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new lx1();
            case 16:
                return new j5b();
            default:
                return new x13();
        }
    }

    public void c(w98 w98) {
        switch (this.a) {
            case 23:
                if (w98.isConnected()) {
                    a98 a98 = w98.a;
                    a98.getClass();
                    fm9.k(Looper.myLooper() == a98.X.getLooper());
                    a98.o.getClass();
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                zr6.o(w98);
                throw null;
            case 25:
                w98.h.f(26, new ta4(20));
                return;
            case 26:
                a98 a982 = w98.a;
                Objects.requireNonNull(a982);
                a982.G(new nn6(9, a982));
                return;
            case 27:
                zr6.o(w98);
                throw null;
            case 28:
                if (w98.isConnected()) {
                    a98 a983 = w98.a;
                    a983.getClass();
                    fm9.k(Looper.myLooper() == a983.X.getLooper());
                    a983.o.getClass();
                    return;
                }
                return;
            default:
                if (w98.isConnected()) {
                    a98 a984 = w98.a;
                    a984.getClass();
                    fm9.k(Looper.myLooper() == a984.X.getLooper());
                    a984.o.getClass();
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        ((n3b) obj).h(1);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [eu7, java.lang.Object] */
    public Object parse(db7 db7) {
        ? obj = new Object();
        db7.s();
        while (db7.hasNext()) {
            String T = db7.T();
            T.getClass();
            char c = 65535;
            switch (T.hashCode()) {
                case -1956766558:
                    if (T.equals("auth_token")) {
                        c = 0;
                        break;
                    }
                    break;
                case -22145738:
                    if (T.equals("session_key")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115792:
                    if (T.equals("uid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 438353305:
                    if (T.equals("session_secret_key")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1460528453:
                    if (T.equals("auth_hash")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1955725576:
                    if (T.equals("api_server")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    obj.d = db7.H();
                    break;
                case 1:
                    obj.b = db7.H();
                    break;
                case 2:
                    obj.a = db7.H();
                    break;
                case 3:
                    obj.c = db7.H();
                    break;
                case 4:
                    obj.f = db7.H();
                    break;
                case 5:
                    obj.e = db7.H();
                    break;
                default:
                    db7.z();
                    break;
            }
        }
        db7.q();
        return obj;
    }

    public boolean test(Object obj) {
        return !((Locale) obj).getLanguage().equals(Locale.ENGLISH.getLanguage());
    }

    public Object apply(Object obj, Object obj2) {
        vx7 vx7 = (vx7) obj;
        xx7 xx7 = (xx7) obj2;
        wx7 wx7 = xx7.a;
        List list = xx7.b;
        synchronized (vx7) {
            vx7.a.add(wx7);
            ArrayList arrayList = new ArrayList(vx7.c);
            arrayList.addAll(b0d.c(arrayList, list));
            arrayList.sort(new ca3(3, vx7));
            vx7.c = arrayList;
        }
        return vx7;
    }
}
