package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;
import org.webrtc.MediaStreamTrack;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ypc  reason: default package */
public final /* synthetic */ class ypc implements s0a, eqc, pv6, StatsObserver, xha, b66, mq1, wu, grd, qj3, km7, ehe, d38, bb3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ypc(a9f a9f) {
        this.a = 18;
        q8f q8f = q8f.UPLOADING;
        this.b = a9f;
        this.c = q8f;
    }

    public void I(yha yha) {
        ((k56) this.b).invoke();
        int i = gud.$EnumSwitchMapping$0[yha.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            ((k56) this.c).invoke();
        }
    }

    public Object a() {
        switch (this.a) {
            case 16:
                gqc gqc = (gqc) ((t8f) this.b).c;
                gqc.getClass();
                Iterable iterable = (Iterable) this.c;
                if (!iterable.iterator().hasNext()) {
                    return null;
                }
                gqc.m().compileStatement("DELETE FROM events WHERE _id in " + gqc.m0(iterable)).execute();
                return null;
            default:
                t8f t8f = (t8f) this.b;
                t8f.getClass();
                for (Map.Entry entry : ((Map) this.c).entrySet()) {
                    ((gqc) t8f.i).U((long) ((Integer) entry.getValue()).intValue(), rs7.INVALID_PAYLOD, (String) entry.getKey());
                }
                return null;
        }
    }

    public void accept(Object obj) {
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 10:
                ((vpe) obj3).a.put((CharSequence) obj2, (upe) obj);
                return;
            case 13:
                c7f c7f = (c7f) obj3;
                c7f.getClass();
                if (((Throwable) obj) instanceof HttpUrlExpiredException) {
                    u6f b2 = ((v6f) obj2).b();
                    b2.d = null;
                    b2.e = 0.0f;
                    c7f.b(b2.a());
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                c7f c7f2 = (c7f) obj3;
                c7f2.getClass();
                StringBuilder sb = new StringBuilder("onErrorUpload: data=");
                d7f d7f = (d7f) obj2;
                sb.append(d7f);
                hm9.p("c7f", sb.toString(), (Throwable) obj);
                c7f2.d(d7f);
                c7f2.c(d7f);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Throwable th = (Throwable) obj;
                g8f g8f = (g8f) obj3;
                g8f.getClass();
                if ((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b)) {
                    d7f b3 = g8f.b((iy8) obj2);
                    c7f c7f3 = g8f.a;
                    c7f3.d(b3);
                    c7f3.c(b3);
                    return;
                }
                return;
            case 25:
                wef wef = (wef) obj3;
                wef.getClass();
                Locale locale = Locale.ENGLISH;
                StringBuilder sb2 = new StringBuilder("onError: conversionData=");
                lef lef = (lef) obj2;
                sb2.append(lef);
                hm9.p("wef", sb2.toString(), (Throwable) obj);
                wef.a(lef);
                return;
            default:
                Throwable th2 = (Throwable) obj;
                dlf dlf = (dlf) obj3;
                if (!dlf.a(th2)) {
                    ad adVar = (ad) dlf.c.get();
                    k20 k20 = (k20) obj2;
                    if (adVar != null) {
                        if (oag.t(k20.i)) {
                            adVar.f("ACTION_VIDEO_FETCH_FAILURE");
                        } else {
                            adVar.g("ACTION_VIDEO_FETCH_FAILURE", k20.i);
                        }
                    }
                    hm9.p("VideoRipper", "ripVideo: failed to fetch " + k20.h, th2);
                    return;
                }
                return;
        }
    }

    public bm7 apply(Object obj) {
        switch (this.a) {
            case 8:
                List list = (List) obj;
                ((ihe) this.b).toString();
                Objects.toString(list);
                if (list.isEmpty()) {
                    return new dw6(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
                }
                if (!list.contains((Object) null)) {
                    return kq0.r(list);
                }
                return new dw6(1, new DeferrableSurface$SurfaceClosedException((xf4) ((List) this.c).get(list.indexOf((Object) null)), "Surface closed"));
            default:
                Void voidR = (Void) obj;
                ejc ejc = (ejc) this.b;
                ejc.getClass();
                List list2 = (List) this.c;
                Integer num = (Integer) ((kz1) list2.get(0)).b.f(kz1.j, 100);
                Objects.requireNonNull(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) ((kz1) list2.get(0)).b.f(kz1.i, 0);
                Objects.requireNonNull(num2);
                int intValue2 = num2.intValue();
                nw4 nw4 = ((c9e) ((bqc) ejc.d).b).u;
                if (nw4 != null) {
                    return ((lee) nw4.b).b(intValue, intValue2);
                }
                return new dw6(1, new Exception("Failed to take picture: pipeline is not ready."));
        }
    }

    public void b(ra3 ra3) {
        switch (this.a) {
            case 19:
                a9f a9f = (a9f) this.b;
                String str = (String) this.c;
                a9f.getClass();
                hm9.m("a9f", "removeUploadWithPhotoToken: token=" + str, new Object[0]);
                synchronized (a9f) {
                    a9f.a.e(str).e(((y8f) a9f.b.getValue()).e(str)).a();
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
            case 20:
                a9f a9f2 = (a9f) this.b;
                v6f v6f = (v6f) this.c;
                a9f2.getClass();
                hm9.m("a9f", "putUpload: upload=" + v6f, new Object[0]);
                synchronized (a9f2) {
                    a9f2.a.a(v6f).e(((y8f) a9f2.b.getValue()).a(v6f)).a();
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
            case 21:
                c9f c9f = (c9f) this.b;
                c9f.getClass();
                v6f v6f2 = (v6f) this.c;
                ((Map) c9f.b).put(v6f2.a, v6f2);
                ra3.b();
                return;
            default:
                c9f c9f2 = (c9f) this.b;
                b7b b7b = (b7b) this.c;
                synchronized (((Map) c9f2.b)) {
                    try {
                        Iterator it = ((Map) c9f2.b).entrySet().iterator();
                        while (it.hasNext()) {
                            p8f p8f = ((v6f) ((Map.Entry) it.next()).getValue()).h;
                            if (p8f != null) {
                                if (b7b.test(p8f)) {
                                    it.remove();
                                }
                            }
                        }
                    } finally {
                        while (true) {
                            break;
                        }
                    }
                }
                if (!ra3.h()) {
                    ra3.b();
                    return;
                }
                return;
        }
    }

    public void d(j28 j28) {
        List list;
        a9f a9f = (a9f) this.b;
        a9f.getClass();
        hm9.m("a9f", "getUploadsWithStatus: uploadStatus=" + ((q8f) this.c), new Object[0]);
        synchronized (a9f) {
            list = (List) ((y8f) a9f.b.getValue()).f().b();
        }
        if (j28.h()) {
            return;
        }
        if (list == null || list.isEmpty()) {
            j28.b();
        } else {
            j28.a(list);
        }
    }

    public void e(ez9 ez9) {
        ay3 ay3 = new ay3((String[]) this.b, ez9, 2);
        ilc ilc = (ilc) this.c;
        ilc.e.a(ay3);
        dm4.d(ez9, new w6(0, new p00((OneMeRoomDatabase) ilc, 9, ay3)));
        ez9.d(ngg.c);
    }

    public void f(qv6 qv6) {
        hqc hqc = (hqc) this.b;
        hqc.getClass();
        ((pv6) this.c).f(hqc);
    }

    public void invoke(Object obj) {
        ol8 ol8 = (ol8) obj;
        h1f h1f = (h1f) this.b;
        h1f.t.getClass();
        v85 a2 = h1f.q.a();
        String str = ol8.b;
        ExportException exportException = (ExportException) this.c;
        hm9.p(str, "onError", exportException);
        RuntimeException runtimeException = new RuntimeException("Media transform failed", exportException);
        ml8 ml8 = ol8.a;
        ml8.f.set(a2);
        ml8.g.set(runtimeException);
        ol8.a();
    }

    public void j(nqd nqd) {
        ArrayList arrayList;
        boolean z;
        nqd nqd2 = nqd;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 9:
                tle tle = (tle) obj2;
                tle.getClass();
                rle rle = new rle(nqd2);
                je7 je7 = tle.x0;
                ((yle) je7.getValue()).f(false);
                gaa gaa = new gaa((Object) rle);
                yle yle = (yle) je7.getValue();
                dle dle = (dle) obj;
                long d = tle.d(dle);
                x9d x9d = (x9d) yle.Y.get();
                if (x9d != null && !yle.e(dle, gaa)) {
                    x9d.i(dle, false, d, gaa);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                wef wef = (wef) obj2;
                wef.getClass();
                kef kef = (kef) obj;
                lef lef = kef.a;
                af8 af8 = wef.a;
                cj0 cj0 = (cj0) af8;
                String str = kef.c;
                cj0.getClass();
                nqb nqb = null;
                try {
                    arrayList = j1e.s(Uri.parse(str), cj0.a, cj0);
                } catch (Throwable th) {
                    hm9.p("cj0", "getAvailableQualitiesForVideo: failed", th);
                    arrayList = null;
                }
                if (arrayList != null && !arrayList.isEmpty()) {
                    mqb mqb = lef.b.a;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        nqb nqb2 = nqb;
                        while (true) {
                            if (it.hasNext()) {
                                nqb = (nqb) it.next();
                                if (nqb.a == mqb) {
                                }
                            } else if (nqb2 != null) {
                                boolean z2 = nqb2.f;
                                ref ref = lef.b;
                                if (!z2 || ref.b != 0.0f || ref.c != 1.0f || ref.d) {
                                    kj6.r(kef.d);
                                    try {
                                        z = ((ada) af8).e(kef.c, kef.d, ref.b, ref.c, nqb2, ref.d, new n2f(17));
                                        ad adVar = wef.d;
                                        if (z) {
                                            adVar.f("VIDEO_CONVERT_SUCCESS");
                                        } else {
                                            adVar.f("VIDEO_CONVERT_ERROR");
                                        }
                                    } catch (InterruptedException e) {
                                        if (!nqd.h()) {
                                            nqd2.onError(e);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    w36 a2 = kef.a();
                                    a2.o = str;
                                    kef = new kef(a2);
                                    z = true;
                                }
                                if (nqd.h()) {
                                    return;
                                }
                                if (z) {
                                    w36 a3 = kef.a();
                                    a3.a = true;
                                    nqd2.a(new kef(a3));
                                    return;
                                }
                                nqd2.onError(new RuntimeException("failed to convert video"));
                                return;
                            } else if (!nqd.h()) {
                                nqd2.onError(new RuntimeException("no available quality found for video"));
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                } else if (!nqd.h()) {
                    nqd2.onError(new RuntimeException("no available qualities for video"));
                    return;
                } else {
                    return;
                }
                break;
            default:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$1((WaitingRoomParticipants) obj2, (ConversationWaitingParticipantId) obj, nqd2);
                return;
        }
    }

    public void onComplete(StatsReport[] statsReportArr) {
        String str;
        StatsReport[] statsReportArr2 = statsReportArr;
        h7d h7d = (h7d) this.b;
        h7d.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = statsReportArr2.length;
        int i = 0;
        while (i < length) {
            StatsReport statsReport = statsReportArr2[i];
            if ("ssrc".equals(statsReport.type) && "ssrc".equals(statsReport.type)) {
                StatsReport.Value[] valueArr = statsReport.values;
                int length2 = valueArr.length;
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    StatsReport.Value value = valueArr[i2];
                    if ("googTrackId".equals(value.name)) {
                        String str2 = value.value;
                        if (str2 != null && str2.endsWith("audio-mix")) {
                            arrayList2.add(new dbg((bg1) null, true, false));
                            arrayList.add(statsReport);
                            break;
                        }
                        String str3 = value.value;
                        bg1 b2 = (TextUtils.isEmpty(str3) || !str3.startsWith("audio-") || str3.length() == 6) ? null : bg1.b(str3.substring(6));
                        if (b2 == null) {
                            b2 = f46.a0(str3);
                        }
                        if (b2 == null) {
                            d dVar = h7d.s0;
                            if (!(dVar == null || (str = value.value) == null || !str.startsWith(((kq7) dVar.a().b).m))) {
                                arrayList2.add(new dbg((bg1) null, false, true));
                                arrayList.add(statsReport);
                                break;
                            }
                        } else {
                            arrayList2.add(new dbg(b2, false, false));
                            arrayList.add(statsReport);
                            break;
                        }
                    } else if ("mediaType".equals(value.name) && MediaStreamTrack.AUDIO_TRACK_KIND.equals(value.value)) {
                        z = true;
                    } else if ("packetsReceived".equals(value.name)) {
                        z2 = true;
                    }
                    if (z && z2) {
                        arrayList2.add(new dbg((bg1) null, true, false));
                        arrayList.add(statsReport);
                        break;
                    }
                    i2++;
                    StatsReport[] statsReportArr3 = statsReportArr;
                }
            }
            i++;
            statsReportArr2 = statsReportArr;
        }
        h7d.a.post(new vq1(h7d, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[0]), arrayList2, (y1e) this.c, 7));
    }

    public String q(lq1 lq1) {
        switch (this.a) {
            case 7:
                see see = (see) this.b;
                see.getClass();
                ((AtomicReference) this.c).set(lq1);
                return "SurfaceRequest-surface-recreation(" + see.hashCode() + ")";
            case 11:
                hre hre = (hre) this.b;
                see see2 = hre.h;
                ok4 k = ju0.k();
                cy1 cy1 = new cy1(9, lq1);
                Surface surface = (Surface) this.c;
                see2.b(surface, k, cy1);
                return "provideSurface[request=" + hre.h + " surface=" + surface + "]";
            default:
                ((rdf) this.b).getClass();
                Integer valueOf = Integer.valueOf(lq1.hashCode());
                bad bad = (bad) this.c;
                ((ui9) bad.b.g).a.put("androidx.camera.video.VideoCapture.streamUpdate", valueOf);
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                ndf ndf = new ndf(atomicBoolean, lq1, bad);
                lq1.a(new ewc(atomicBoolean, bad, ndf, 12), ju0.k());
                bad.b.b(ndf);
                return String.format("%s[0x%x]", new Object[]{"androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(lq1.hashCode())});
        }
    }

    public /* synthetic */ ypc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.lang.Object, k3e] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e4 A[Catch:{ all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m55apply(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.a
            switch(r0) {
                case 1: goto L_0x003f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r0 = r13.b
            a4e r0 = (defpackage.a4e) r0
            r0.getClass()
            java.lang.Object r13 = r13.c
            q3e r13 = (defpackage.q3e) r13
            long r0 = r13.a
            k3e r2 = new k3e
            r2.<init>()
            r2.a = r0
            java.lang.String r0 = r13.b
            r2.b = r0
            java.lang.String r0 = r13.c
            r2.c = r0
            long r0 = r13.d
            r2.d = r0
            long r0 = r13.e
            r2.e = r0
            long r0 = r13.f
            r2.f = r0
            java.lang.String r0 = r13.g
            r2.g = r0
            r2.h = r14
            boolean r13 = r13.i
            r2.i = r13
            m3e r13 = new m3e
            r13.<init>(r2)
            return r13
        L_0x003f:
            r3 = r14
            android.database.sqlite.SQLiteDatabase r3 = (android.database.sqlite.SQLiteDatabase) r3
            java.lang.Object r14 = r13.b
            gqc r14 = (defpackage.gqc) r14
            ka0 r0 = r14.o
            int r1 = r0.b
            java.lang.Object r13 = r13.c
            hc0 r13 = (defpackage.hc0) r13
            java.util.ArrayList r1 = r14.S(r3, r13, r1)
            z8b[] r2 = defpackage.z8b.values()
            int r4 = r2.length
            r11 = 0
            r5 = r11
        L_0x0059:
            if (r5 >= r4) goto L_0x0093
            r6 = r2[r5]
            z8b r7 = r13.c
            if (r6 != r7) goto L_0x0062
            goto L_0x0088
        L_0x0062:
            int r7 = r1.size()
            int r8 = r0.b
            int r8 = r8 - r7
            if (r8 > 0) goto L_0x006c
            goto L_0x0093
        L_0x006c:
            vq7 r7 = defpackage.hc0.a()
            java.lang.String r9 = r13.a
            r7.t(r9)
            if (r6 == 0) goto L_0x008b
            r7.o = r6
            byte[] r6 = r13.b
            r7.c = r6
            hc0 r6 = r7.j()
            java.util.ArrayList r6 = r14.S(r3, r6, r8)
            r1.addAll(r6)
        L_0x0088:
            int r5 = r5 + 1
            goto L_0x0059
        L_0x008b:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            java.lang.String r14 = "Null priority"
            r13.<init>(r14)
            throw r13
        L_0x0093:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "event_id IN ("
            r14.<init>(r0)
            r0 = r11
        L_0x00a0:
            int r2 = r1.size()
            r12 = 1
            if (r0 >= r2) goto L_0x00c1
            java.lang.Object r2 = r1.get(r0)
            fb0 r2 = (defpackage.fb0) r2
            long r4 = r2.a
            r14.append(r4)
            int r2 = r1.size()
            int r2 = r2 - r12
            if (r0 >= r2) goto L_0x00be
            r2 = 44
            r14.append(r2)
        L_0x00be:
            int r0 = r0 + 1
            goto L_0x00a0
        L_0x00c1:
            r0 = 41
            r14.append(r0)
            java.lang.String r0 = "value"
            java.lang.String r2 = "event_id"
            java.lang.String r4 = "name"
            java.lang.String[] r5 = new java.lang.String[]{r2, r4, r0}
            java.lang.String r6 = r14.toString()
            r9 = 0
            r10 = 0
            java.lang.String r4 = "event_metadata"
            r7 = 0
            r8 = 0
            android.database.Cursor r14 = r3.query(r4, r5, r6, r7, r8, r9, r10)
        L_0x00de:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0112
            long r2 = r14.getLong(r11)     // Catch:{ all -> 0x016c }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016c }
            java.lang.Object r0 = r13.get(r0)     // Catch:{ all -> 0x016c }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0100
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x016c }
            r0.<init>()     // Catch:{ all -> 0x016c }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x016c }
            r13.put(r2, r0)     // Catch:{ all -> 0x016c }
        L_0x0100:
            fqc r2 = new fqc     // Catch:{ all -> 0x016c }
            java.lang.String r3 = r14.getString(r12)     // Catch:{ all -> 0x016c }
            r4 = 2
            java.lang.String r4 = r14.getString(r4)     // Catch:{ all -> 0x016c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x016c }
            r0.add(r2)     // Catch:{ all -> 0x016c }
            goto L_0x00de
        L_0x0112:
            r14.close()
            java.util.ListIterator r14 = r1.listIterator()
        L_0x0119:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016b
            java.lang.Object r0 = r14.next()
            fb0 r0 = (defpackage.fb0) r0
            long r2 = r0.a
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r13.containsKey(r2)
            if (r2 != 0) goto L_0x0132
            goto L_0x0119
        L_0x0132:
            ja0 r2 = r0.c
            ai3 r2 = r2.c()
            long r3 = r0.a
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
            java.lang.Object r5 = r13.get(r5)
            java.util.Set r5 = (java.util.Set) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0148:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x015c
            java.lang.Object r6 = r5.next()
            fqc r6 = (defpackage.fqc) r6
            java.lang.String r7 = r6.a
            java.lang.String r6 = r6.b
            r2.a(r7, r6)
            goto L_0x0148
        L_0x015c:
            ja0 r2 = r2.c()
            fb0 r5 = new fb0
            hc0 r0 = r0.b
            r5.<init>(r3, r0, r2)
            r14.set(r5)
            goto L_0x0119
        L_0x016b:
            return r1
        L_0x016c:
            r13 = move-exception
            r14.close()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypc.m55apply(java.lang.Object):java.lang.Object");
    }
}
