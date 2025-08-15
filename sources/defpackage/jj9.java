package defpackage;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.MyTrackerConfig;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.OneMeApplication;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.webrtc.Predicate;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jj9  reason: default package */
public final /* synthetic */ class jj9 implements qj3, b66, b7b, MyTrackerConfig.OkHttpClientProvider, MyTracker.AttributionListener, df9, Predicate, qa5, ra5, dwe, Provider, o1d, ru0, pic {
    public final /* synthetic */ int a;

    public /* synthetic */ jj9(int i) {
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ka5[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.ka5[] a() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            int r2 = r2.a
            switch(r2) {
                case 18: goto L_0x0011;
                default: goto L_0x0007;
            }
        L_0x0007:
            rpb r2 = new rpb
            r2.<init>()
            ka5[] r1 = new defpackage.ka5[r1]
            r1[r0] = r2
            return r1
        L_0x0011:
            j2a r2 = new j2a
            r2.<init>()
            ka5[] r1 = new defpackage.ka5[r1]
            r1[r0] = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj9.a():ka5[]");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                hm9.o("lj9", "Can't update seek");
                return;
            case 1:
                Throwable th2 = (Throwable) obj;
                hm9.o("sj9", "Error in timer");
                return;
            case 4:
                Throwable th3 = (Throwable) obj;
                hm9.o("bk9", "Can't hide controls");
                return;
            case 5:
                Throwable th4 = (Throwable) obj;
                hm9.o("bk9", "Can't update seek");
                return;
            case 6:
                hm9.p("fk9", "Can't setupUpdateAddress", (Throwable) obj);
                return;
            case 7:
                hm9.p("fk9", "Can't setupLiveLocationUpdate", (Throwable) obj);
                return;
            case 10:
                hm9.p("fk9", "Error in timer", (Throwable) obj);
                return;
            case 11:
                Throwable th5 = (Throwable) obj;
                hm9.o("fk9", "Can't load initial live switch state");
                return;
            case 13:
                hm9.p("hk9", "Error in extractThumbnail", (Throwable) obj);
                return;
            default:
                Long l = (Long) obj;
                ConcurrentHashMap concurrentHashMap = sna.b;
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                return qy9.j((List) obj);
            case 3:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case 8:
                return (List) obj;
            default:
                ((kw8) obj).getClass();
                return 0L;
        }
    }

    public String c() {
        return null;
    }

    public void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        switch (this.a) {
            case 26:
                bitmap.recycle();
                return;
            default:
                bitmap.recycle();
                return;
        }
    }

    public su0 g(Bundle bundle) {
        boolean z = false;
        if (bundle.getInt(Integer.toString(0, 36), -1) == 1) {
            z = true;
        }
        np8.d(z);
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new xsa() : new xsa(f);
    }

    public Object get() {
        return null;
    }

    public u2a getOkHttpClient() {
        return ((k5c) y8a.a.getAccessor().c(k5c.class)).a;
    }

    public int i(int i) {
        bc7[] bc7Arr = OtherNotificationsSettingsScreen.Y;
        return 4;
    }

    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        ul9.c.g(myTrackerAttribution.getDeeplink());
    }

    public Object r(gy8 gy8) {
        int i;
        String str;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        if (i == 0) {
            return null;
        }
        String str2 = "";
        boolean z = false;
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th4);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th4;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != 3355) {
                    if (hashCode != 99333) {
                        if (hashCode == 116079 && str.equals("url")) {
                            try {
                                str2 = lz7.P(gy8);
                            } catch (Throwable th5) {
                                Throwable th6 = th5;
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th6);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    str2 = null;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th6;
                                }
                            }
                            if (str2 == null) {
                                return null;
                            }
                        }
                    } else if (str.equals("def")) {
                        try {
                            z = lz7.H(gy8);
                        } catch (Throwable th7) {
                            Throwable th8 = th7;
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th8);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th8);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                z = false;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th8;
                            }
                        }
                    }
                } else if (str.equals("id")) {
                    try {
                        j = lz7.M(gy8, 0);
                    } catch (Throwable th9) {
                        Throwable th10 = th9;
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th10);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th10);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            j = 0;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th10;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th11) {
                    Throwable th12 = th11;
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th12);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th12);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th12;
                    }
                }
            }
            gy8 gy82 = gy8;
        }
        return new po9(j, str2, Boolean.valueOf(z));
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return ((e08) obj).a.a();
            default:
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                int i = hy9.a;
                return true;
        }
    }

    public /* synthetic */ jj9(OneMeApplication oneMeApplication) {
        this.a = 22;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: la5[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.la5[] m62a() {
        /*
            r2 = this;
            r0 = 0
            r1 = 1
            int r2 = r2.a
            switch(r2) {
                case 19: goto L_0x0011;
                default: goto L_0x0007;
            }
        L_0x0007:
            spb r2 = new spb
            r2.<init>()
            la5[] r1 = new defpackage.la5[r1]
            r1[r0] = r2
            return r1
        L_0x0011:
            k2a r2 = new k2a
            r2.<init>()
            la5[] r1 = new defpackage.la5[r1]
            r1[r0] = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj9.m62a():la5[]");
    }
}
