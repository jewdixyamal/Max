package defpackage;

import android.media.CamcorderProfile;
import android.net.Uri;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;
import one.me.sdk.arch.Widget;
import org.apache.http.util.LangUtils;

/* renamed from: nd2  reason: default package */
public final class nd2 implements za7, b66, b7b, ht1, jw5, df9, edc, xld, Provider {
    public static final nd2 X = new nd2(4);
    public static final nd2 Y = new nd2(6);
    public static final nd2 b = new nd2(1);
    public static final nd2 c = new nd2(2);
    public static final nd2 o = new nd2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ nd2(int i) {
        this.a = i;
    }

    public static final String d(Uri uri) {
        String uri2 = uri.toString();
        return uri2.length() > 30 ? uri2.substring(0, 30).concat("...") : uri2;
    }

    public static final void f(wv6 wv6) {
        if (!(wv6.l.a <= 3)) {
            throw new IllegalArgumentException();
        }
    }

    public static List g(List list, List list2) {
        if (list.isEmpty()) {
            return x53.x0(list2, fs4.b);
        }
        if (list2.isEmpty()) {
            return list;
        }
        kl7 l = j1e.l();
        l.addAll(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            h(l, (ls4) it.next());
        }
        if (l.getSize() > 15) {
            ld7 ld7 = new ld7(n4c.a);
            int i = 0;
            while (l.getSize() > 14) {
                i += ((ls4) l.a(ld7.nextInt(l.getSize()))).c;
            }
            h(l, new ls4("unknown", "max_size_exceeded", i));
        }
        return j1e.d(l);
    }

    public static void h(kl7 kl7, ls4 ls4) {
        int i;
        int size = kl7.getSize();
        y53.P(kl7.getSize(), 0, size);
        int i2 = size - 1;
        int i3 = 0;
        while (true) {
            if (i3 > i2) {
                i = -(i3 + 1);
                break;
            }
            i = (i3 + i2) >>> 1;
            ls4 ls42 = (ls4) kl7.get(i);
            int compareTo = ls42.a.compareTo(ls4.a);
            if (compareTo == 0 && (compareTo = ls42.b.compareTo(ls4.b)) == 0) {
                compareTo = 0;
            }
            if (compareTo >= 0) {
                if (compareTo <= 0) {
                    break;
                }
                i2 = i - 1;
            } else {
                i3 = i + 1;
            }
        }
        if (i >= 0) {
            ls4 ls43 = (ls4) kl7.get(i);
            kl7.set(i, new ls4(ls43.a, ls43.b, ls43.c + ls4.c));
            return;
        }
        kl7.add((-i) - 1, ls4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: gx3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(android.content.Context r15, defpackage.o97 r16, java.io.File r17, java.lang.String r18, java.lang.Long r19, java.util.Map r20, int r21) {
        /*
            r0 = r21
            r1 = 0
            r2 = r0 & 16
            r3 = 0
            if (r2 == 0) goto L_0x000a
            r2 = r3
            goto L_0x000c
        L_0x000a:
            r2 = r18
        L_0x000c:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0013
            oz4 r0 = defpackage.oz4.a
            goto L_0x0015
        L_0x0013:
            r0 = r20
        L_0x0015:
            long r4 = r17.length()
            java.lang.String r6 = r17.getName()
            android.content.pm.PackageManager r7 = r15.getPackageManager()
            java.lang.String r8 = r15.getPackageName()
            android.content.pm.PackageInfo r7 = defpackage.ote.u(r7, r8)
            long r7 = r7.getLongVersionCode()
            qqd r9 = new qqd
            r10 = 9
            r9.<init>((int) r10, (byte) r1)
            java.lang.String r10 = "tracer_feature_name"
            r11 = r16
            java.lang.String r11 = r11.b
            r9.F(r10, r11)
            java.lang.String r10 = "tracer_feature_uze_gzip"
            r11 = 1
            r9.D(r10, r11)
            java.lang.String r10 = "tracer_sample_file_path"
            java.lang.String r12 = r17.getPath()
            r9.F(r10, r12)
            java.lang.String r10 = "tracer_sample_file_size"
            r9.E(r4, r10)
            java.lang.String r4 = "tracer_sample_file_name"
            r9.F(r4, r6)
            java.lang.String r4 = "tracer_feature_tag"
            r9.F(r4, r2)
            java.lang.String r2 = "tracer_has_attr1"
            r9.D(r2, r11)
            java.lang.Object r2 = r9.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r4 = "tracer_attr1"
            r5 = r19
            r2.put(r4, r5)
            java.util.Set r2 = r0.keySet()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Object r2 = r9.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.String r4 = "tracer_custom_properties_keys"
            r2.put(r4, r1)
            r9.B(r0)
            java.lang.String r0 = "tracer_version_code"
            r9.E(r7, r0)
            d24 r0 = r9.p()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            kye r2 = defpackage.kye.a
            java.util.Map r2 = defpackage.kye.c()
            o97 r4 = defpackage.ote.b
            java.lang.Object r2 = r2.get(r4)
            boolean r4 = r2 instanceof defpackage.gx3
            if (r4 == 0) goto L_0x00a4
            r3 = r2
            gx3 r3 = (defpackage.gx3) r3
        L_0x00a4:
            if (r3 != 0) goto L_0x00b0
            ph4 r2 = new ph4
            r3 = 14
            r2.<init>((int) r3)
            r2.f()
        L_0x00b0:
            java.util.Set r14 = defpackage.x53.H0(r1)
            kj3 r1 = new kj3
            r8 = 1
            r9 = 0
            r5 = 3
            r6 = 0
            r7 = 1
            r10 = -1
            r12 = -1
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r14)
            qla r2 = new qla
            java.lang.Class<ru.ok.tracer.upload.SampleUploadWorker> r3 = ru.ok.tracer.upload.SampleUploadWorker.class
            r2.<init>(r3)
            androidx.work.WorkRequest$Builder r1 = r2.setConstraints(r1)
            qla r1 = (defpackage.qla) r1
            androidx.work.WorkRequest$Builder r0 = r1.setInputData(r0)
            qla r0 = (defpackage.qla) r0
            androidx.work.WorkRequest r0 = r0.build()
            rla r0 = (defpackage.rla) r0
            s7g r1 = defpackage.s7g.d(r15)
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd2.i(android.content.Context, o97, java.io.File, java.lang.String, java.lang.Long, java.util.Map, int):void");
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 2:
                ztc ztc = (ztc) obj;
                return ((jle) ((hle) sd3.g.getValue())).a();
            default:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
        }
    }

    public mn5 b(j0e j0e) {
        return new mqc(new a0e(j0e, (Continuation) null));
    }

    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public Widget e(String str, b bVar) {
        ChatsListWidget chatsListWidget = new ChatsListWidget(str);
        chatsListWidget.z0 = bVar;
        if (chatsListWidget.isAttached()) {
            chatsListWidget.o0().setRecycledViewPool(bVar);
        }
        return chatsListWidget;
    }

    public Object get() {
        return new d9f(0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        if (r1.equals("error_msg") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010b, code lost:
        if (r1.equals("error") == false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        r6 = r13.H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013a, code lost:
        r13.z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object parse(defpackage.db7 r13) {
        /*
            r12 = this;
            r13.s()
            r12 = 0
            r0 = 0
            r4 = r12
            r12 = r0
            r6 = r12
            r7 = r6
            r9 = r7
            r10 = r9
            r11 = r10
        L_0x000c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0144
            java.lang.String r1 = r13.T()
            int r2 = r1.hashCode()
            r3 = 110(0x6e, float:1.54E-43)
            switch(r2) {
                case -1125973592: goto L_0x0132;
                case -830722045: goto L_0x0123;
                case -22145738: goto L_0x0114;
                case 96784904: goto L_0x0105;
                case 329868490: goto L_0x00fc;
                case 438353305: goto L_0x00ed;
                case 717465530: goto L_0x00c1;
                case 1635686852: goto L_0x00b1;
                case 1635703681: goto L_0x00a1;
                case 1636060774: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x013a
        L_0x0021:
            java.lang.String r2 = "error_page"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002b
            goto L_0x013a
        L_0x002b:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x009c
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0039
            r13.H()
            goto L_0x000c
        L_0x0039:
            r13.s()
        L_0x003c:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0097
            java.lang.String r1 = r13.T()
            int r5 = r1.hashCode()
            r8 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r5 == r8) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            java.lang.String r5 = "message"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0093
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x008f
            if (r1 == r2) goto L_0x0064
            r13.H()
            goto L_0x003c
        L_0x0064:
            r13.s()
        L_0x0067:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = r13.T()
            int r5 = r1.hashCode()
            r8 = 106748362(0x65cd9ca, float:4.1537407E-35)
            if (r5 == r8) goto L_0x007b
            goto L_0x0087
        L_0x007b:
            java.lang.String r5 = "plain"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0087
            r13.H()
            goto L_0x0067
        L_0x0087:
            r13.z()
            goto L_0x0067
        L_0x008b:
            r13.q()
            goto L_0x003c
        L_0x008f:
            r13.z()
            goto L_0x003c
        L_0x0093:
            r13.z()
            goto L_0x003c
        L_0x0097:
            r13.q()
            goto L_0x000c
        L_0x009c:
            r13.z()
            goto L_0x000c
        L_0x00a1:
            java.lang.String r2 = "error_data"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00ab
            goto L_0x013a
        L_0x00ab:
            java.lang.String r9 = r13.f0()
            goto L_0x000c
        L_0x00b1:
            java.lang.String r2 = "error_code"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00bb
            goto L_0x013a
        L_0x00bb:
            int r4 = r13.D()
            goto L_0x000c
        L_0x00c1:
            java.lang.String r2 = "custom_error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00cb
            goto L_0x013a
        L_0x00cb:
            int r1 = r13.peek()
            if (r1 == r3) goto L_0x00e8
            r13.s()
        L_0x00d4:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x00e3
            java.lang.String r10 = r13.T()
            java.lang.String r11 = r13.V()
            goto L_0x00d4
        L_0x00e3:
            r13.q()
            goto L_0x000c
        L_0x00e8:
            r13.z()
            goto L_0x000c
        L_0x00ed:
            java.lang.String r2 = "session_secret_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x00f6
            goto L_0x013a
        L_0x00f6:
            java.lang.String r12 = r13.H()
            goto L_0x000c
        L_0x00fc:
            java.lang.String r2 = "error_msg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x0105:
            java.lang.String r2 = "error"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x010e
            goto L_0x013a
        L_0x010e:
            java.lang.String r6 = r13.H()
            goto L_0x000c
        L_0x0114:
            java.lang.String r2 = "session_key"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x011d
            goto L_0x013a
        L_0x011d:
            java.lang.String r0 = r13.H()
            goto L_0x000c
        L_0x0123:
            java.lang.String r2 = "error_field"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x012c
            goto L_0x013a
        L_0x012c:
            java.lang.String r7 = r13.f0()
            goto L_0x000c
        L_0x0132:
            java.lang.String r2 = "ver_redirect_url"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x013f
        L_0x013a:
            r13.z()
            goto L_0x000c
        L_0x013f:
            r13.H()
            goto L_0x000c
        L_0x0144:
            r13.q()
            r13 = 100
            if (r4 == r13) goto L_0x019d
            r13 = 107(0x6b, float:1.5E-43)
            if (r4 == r13) goto L_0x0183
            r12 = 401(0x191, float:5.62E-43)
            if (r4 == r12) goto L_0x017a
            r12 = 403(0x193, float:5.65E-43)
            if (r4 == r12) goto L_0x0171
            r12 = 102(0x66, float:1.43E-43)
            if (r4 == r12) goto L_0x016b
            r12 = 103(0x67, float:1.44E-43)
            if (r4 == r12) goto L_0x016b
            ru.ok.android.api.core.ApiInvocationException r12 = new ru.ok.android.api.core.ApiInvocationException
            r1 = r12
            r2 = r6
            r3 = r7
            r5 = r9
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x01a5
        L_0x016b:
            ru.ok.android.api.session.ApiRecreateSessionException r12 = new ru.ok.android.api.session.ApiRecreateSessionException
            r12.<init>(r4, r6)
            goto L_0x01a5
        L_0x0171:
            ru.ok.android.api.core.ApiCaptchaException r12 = new ru.ok.android.api.core.ApiCaptchaException
            r8 = 403(0x193, float:5.65E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x017a:
            ru.ok.android.api.core.ApiLoginException r12 = new ru.ok.android.api.core.ApiLoginException
            r8 = 401(0x191, float:5.62E-43)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x01a5
        L_0x0183:
            if (r0 == 0) goto L_0x0195
            if (r12 == 0) goto L_0x018d
            ru.ok.android.api.session.ApiSessionChangedException r13 = new ru.ok.android.api.session.ApiSessionChangedException
            r13.<init>(r6, r0, r12)
            goto L_0x01a6
        L_0x018d:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionSecretKey"
            r12.<init>(r13)
            throw r12
        L_0x0195:
            ru.ok.android.api.json.JsonParseException r12 = new ru.ok.android.api.json.JsonParseException
            java.lang.String r13 = "No sessionKey"
            r12.<init>(r13)
            throw r12
        L_0x019d:
            ru.ok.android.api.core.ApiInvocationParamException r12 = new ru.ok.android.api.core.ApiInvocationParamException
            r8 = 100
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L_0x01a5:
            r13 = r12
        L_0x01a6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd2.parse(db7):java.lang.Object");
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        mud mud;
        String message;
        if (!(unsatisfiedLinkError instanceof mud) || (unsatisfiedLinkError instanceof lud) || (message = mud.getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        Objects.toString(unsatisfiedLinkError);
        String str = (mud = (mud) unsatisfiedLinkError).a;
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (of0 of0 : nudArr) {
            if (of0 instanceof of0) {
                of0 of02 = of0;
                try {
                    of02.getClass();
                    of02.d(2);
                } catch (Exception unused) {
                    of02.getClass();
                    return false;
                }
            }
        }
        return true;
    }

    public Object r(gy8 gy8) {
        long j = 0;
        try {
            j = lz7.M(gy8, 0);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s != 0) {
                if (s != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                throw th;
            }
        }
        return Long.valueOf(j);
    }

    public boolean test(Object obj) {
        return ((Boolean) obj).booleanValue();
    }

    public String toString() {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
