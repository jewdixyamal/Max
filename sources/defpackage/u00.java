package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.StatsObserver;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: u00  reason: default package */
public final /* synthetic */ class u00 implements grd, t31, wu, qj3, ehe, mq1, StatsObserver, f5c, sbe, lag, hje, lde, s0a, u98, km7, ri8, vu, ree, eqc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u00(si8 si8, y9d y9d, Bundle bundle, ResultReceiver resultReceiver) {
        this.a = 17;
        this.b = si8;
        this.c = bundle;
        this.o = resultReceiver;
    }

    public Object a() {
        kd4 kd4 = (kd4) this.b;
        gqc gqc = (gqc) kd4.d;
        gqc.getClass();
        hc0 hc0 = (hc0) this.c;
        z8b z8b = hc0.c;
        ja0 ja0 = (ja0) this.o;
        String str = ja0.a;
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(z8b);
        }
        ((Long) gqc.o(new u00((Object) gqc, (Object) ja0, (Object) hc0, 26))).getClass();
        kd4.a.a(hc0, 1, false);
        return null;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                u82 u82 = (u82) obj;
                ((p82) this.b).getClass();
                Set set = (Set) this.c;
                w82 a2 = p82.H(u82, set).a();
                a2.o = (d92) this.o;
                p82.a0(u82, set, a2.a());
                return;
            default:
                zp6 zp6 = (zp6) obj;
                oke oke = (oke) this.b;
                oke.getClass();
                boolean z = zp6.a;
                wd6 wd6 = (wd6) this.o;
                if (z) {
                    je7 je7 = oke.c;
                    jp jpVar = ((p7b) ((m7b) je7.getValue())).c;
                    ((p7b) ((m7b) je7.getValue())).b.getClass();
                    jpVar.m("app.extra.downloaded.emoji.font.url", "");
                    oke.d((File) this.c, wd6);
                    return;
                }
                oke.v0 = (int) zp6.b;
                long nanoTime = System.nanoTime();
                long j = oke.w0;
                if (j == 0 || Math.abs(nanoTime - j) > 1000000000) {
                    oke.w0 = nanoTime;
                    if (wd6 != null) {
                        int i = oke.v0;
                        hm9.m(LoadEmojiFontWorker.TAG, "onDownloadEmojiFontProgressChange %d", Integer.valueOf(i));
                        ((LoadEmojiFontWorker) wd6.b).state = new sn7(i);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Object, ai3] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0079 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* renamed from: apply  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m137apply(java.lang.Object r26) {
        /*
            r25 = this;
            r0 = r25
            java.lang.String r1 = "bytes"
            r2 = 0
            java.lang.String r3 = "PRAGMA page_size"
            java.lang.String r4 = "PRAGMA page_count"
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            rs7 r9 = defpackage.rs7.CACHE_FULL
            r10 = 2
            java.lang.Object r11 = r0.o
            java.lang.Object r12 = r0.c
            r13 = 0
            java.lang.Object r14 = r0.b
            r15 = 1
            int r0 = r0.a
            switch(r0) {
                case 25: goto L_0x02b3;
                case 26: goto L_0x0145;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            gqc r14 = (defpackage.gqc) r14
            r14.getClass()
        L_0x0026:
            boolean r1 = r0.moveToNext()
            r2 = r12
            java.util.Map r2 = (java.util.Map) r2
            if (r1 == 0) goto L_0x008d
            java.lang.String r1 = r0.getString(r13)
            int r13 = r0.getInt(r15)
            rs7 r16 = defpackage.rs7.REASON_UNKNOWN
            if (r13 != 0) goto L_0x003e
        L_0x003b:
            r5 = r16
            goto L_0x0067
        L_0x003e:
            if (r13 != r15) goto L_0x0043
            rs7 r16 = defpackage.rs7.MESSAGE_TOO_OLD
            goto L_0x003b
        L_0x0043:
            if (r13 != r10) goto L_0x0047
            r5 = r9
            goto L_0x0067
        L_0x0047:
            if (r13 != r8) goto L_0x004c
            rs7 r16 = defpackage.rs7.PAYLOAD_TOO_BIG
            goto L_0x003b
        L_0x004c:
            if (r13 != r7) goto L_0x0051
            rs7 r16 = defpackage.rs7.MAX_RETRIES_REACHED
            goto L_0x003b
        L_0x0051:
            if (r13 != r6) goto L_0x0056
            rs7 r16 = defpackage.rs7.INVALID_PAYLOD
            goto L_0x003b
        L_0x0056:
            if (r13 != r5) goto L_0x005b
            rs7 r16 = defpackage.rs7.SERVER_ERROR
            goto L_0x003b
        L_0x005b:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r5 = "SQLiteEventStore"
            java.lang.String r6 = "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN"
            defpackage.j1e.m(r5, r6, r13)
            goto L_0x003b
        L_0x0067:
            long r7 = r0.getLong(r10)
            boolean r16 = r2.containsKey(r1)
            if (r16 != 0) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2.put(r1, r6)
        L_0x0079:
            java.lang.Object r1 = r2.get(r1)
            java.util.List r1 = (java.util.List) r1
            ss7 r2 = new ss7
            r2.<init>(r7, r5)
            r1.add(r2)
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r13 = 0
            goto L_0x0026
        L_0x008d:
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0095:
            boolean r1 = r0.hasNext()
            r2 = r11
            m5d r2 = (defpackage.m5d) r2
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            int r5 = defpackage.xs7.c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            xs7 r6 = new xs7
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            r6.<init>(r5, r1)
            java.lang.Object r1 = r2.o
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r6)
            goto L_0x0095
        L_0x00c8:
            d9f r0 = r14.b
            long r0 = r0.a()
            android.database.sqlite.SQLiteDatabase r5 = r14.m()
            r5.beginTransaction()
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x0140 }
            java.lang.String r7 = "SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1"
            android.database.Cursor r6 = r5.rawQuery(r7, r6)     // Catch:{ all -> 0x0140 }
            c10 r7 = new c10     // Catch:{ all -> 0x0140 }
            r8 = 26
            r7.<init>(r0, r8)     // Catch:{ all -> 0x0140 }
            java.lang.Object r0 = defpackage.gqc.n0(r6, r7)     // Catch:{ all -> 0x0140 }
            aue r0 = (defpackage.aue) r0     // Catch:{ all -> 0x0140 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0140 }
            r5.endTransaction()
            r2.c = r0
            android.database.sqlite.SQLiteDatabase r0 = r14.m()
            android.database.sqlite.SQLiteStatement r0 = r0.compileStatement(r4)
            long r0 = r0.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r4 = r14.m()
            android.database.sqlite.SQLiteStatement r3 = r4.compileStatement(r3)
            long r3 = r3.simpleQueryForLong()
            long r3 = r3 * r0
            ka0 r0 = defpackage.ka0.f
            r8e r1 = new r8e
            long r5 = r0.a
            r1.<init>(r3, r5)
            xd6 r0 = new xd6
            r0.<init>(r1)
            r2.X = r0
            javax.inject.Provider r0 = r14.X
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r2.b = r0
            p33 r0 = new p33
            java.lang.Object r1 = r2.c
            aue r1 = (defpackage.aue) r1
            java.lang.Object r3 = r2.o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            java.lang.Object r4 = r2.X
            xd6 r4 = (defpackage.xd6) r4
            java.lang.Object r2 = r2.b
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r1, r3, r4, r2)
            return r0
        L_0x0140:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x0145:
            r0 = r26
            android.database.sqlite.SQLiteDatabase r0 = (android.database.sqlite.SQLiteDatabase) r0
            gqc r14 = (defpackage.gqc) r14
            android.database.sqlite.SQLiteDatabase r5 = r14.m()
            android.database.sqlite.SQLiteStatement r4 = r5.compileStatement(r4)
            long r4 = r4.simpleQueryForLong()
            android.database.sqlite.SQLiteDatabase r6 = r14.m()
            android.database.sqlite.SQLiteStatement r3 = r6.compileStatement(r3)
            long r6 = r3.simpleQueryForLong()
            long r6 = r6 * r4
            ka0 r3 = r14.o
            long r4 = r3.a
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            ja0 r12 = (defpackage.ja0) r12
            if (r4 < 0) goto L_0x017d
            java.lang.String r0 = r12.a
            r1 = 1
            r14.U(r1, r9, r0)
            r0 = -1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x02b2
        L_0x017d:
            hc0 r11 = (defpackage.hc0) r11
            java.lang.Long r4 = defpackage.gqc.n(r0, r11)
            if (r4 == 0) goto L_0x018a
            long r4 = r4.longValue()
            goto L_0x01c2
        L_0x018a:
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = "backend_name"
            java.lang.String r6 = r11.a
            r4.put(r5, r6)
            z8b r5 = r11.c
            int r5 = defpackage.d9b.a(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "priority"
            r4.put(r6, r5)
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.String r7 = "next_request_ms"
            r4.put(r7, r6)
            byte[] r6 = r11.b
            if (r6 == 0) goto L_0x01bc
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r5)
            java.lang.String r5 = "extras"
            r4.put(r5, r6)
        L_0x01bc:
            java.lang.String r5 = "transport_contexts"
            long r4 = r0.insert(r5, r2, r4)
        L_0x01c2:
            i05 r6 = r12.c
            byte[] r6 = r6.b
            int r7 = r6.length
            int r3 = r3.e
            if (r7 > r3) goto L_0x01cd
            r7 = r15
            goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "context_id"
            r8.put(r5, r4)
            java.lang.String r4 = "transport_name"
            java.lang.String r5 = r12.a
            r8.put(r4, r5)
            long r4 = r12.d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "timestamp_ms"
            r8.put(r5, r4)
            long r4 = r12.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uptime_ms"
            r8.put(r5, r4)
            i05 r4 = r12.c
            i15 r4 = r4.a
            java.lang.String r4 = r4.a
            java.lang.String r5 = "payload_encoding"
            r8.put(r5, r4)
            java.lang.String r4 = "code"
            java.lang.Integer r5 = r12.b
            r8.put(r4, r5)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.String r9 = "num_attempts"
            r8.put(r9, r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
            java.lang.String r9 = "inline"
            r8.put(r9, r5)
            if (r7 == 0) goto L_0x0222
            r4 = r6
            goto L_0x0224
        L_0x0222:
            byte[] r4 = new byte[r4]
        L_0x0224:
            java.lang.String r5 = "payload"
            r8.put(r5, r4)
            java.lang.String r4 = "events"
            long r4 = r0.insert(r4, r2, r8)
            java.lang.String r8 = "event_id"
            if (r7 != 0) goto L_0x026c
            int r7 = r6.length
            double r9 = (double) r7
            double r13 = (double) r3
            double r9 = r9 / r13
            double r9 = java.lang.Math.ceil(r9)
            int r7 = (int) r9
            r9 = r15
        L_0x023d:
            if (r9 > r7) goto L_0x026c
            int r10 = r9 + -1
            int r10 = r10 * r3
            int r11 = r9 * r3
            int r13 = r6.length
            int r11 = java.lang.Math.min(r11, r13)
            byte[] r10 = java.util.Arrays.copyOfRange(r6, r10, r11)
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            java.lang.Long r13 = java.lang.Long.valueOf(r4)
            r11.put(r8, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r9)
            java.lang.String r14 = "sequence_num"
            r11.put(r14, r13)
            r11.put(r1, r10)
            java.lang.String r10 = "event_payloads"
            r0.insert(r10, r2, r11)
            int r9 = r9 + r15
            goto L_0x023d
        L_0x026c:
            java.util.Map r1 = r12.f
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x027a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x02ae
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            r6.put(r8, r7)
            java.lang.Object r7 = r3.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = "name"
            r6.put(r9, r7)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r7 = "value"
            r6.put(r7, r3)
            java.lang.String r3 = "event_metadata"
            r0.insert(r3, r2, r6)
            goto L_0x027a
        L_0x02ae:
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
        L_0x02b2:
            return r0
        L_0x02b3:
            r0 = r26
            android.database.Cursor r0 = (android.database.Cursor) r0
            gqc r14 = (defpackage.gqc) r14
            r14.getClass()
        L_0x02bc:
            boolean r3 = r0.moveToNext()
            if (r3 == 0) goto L_0x03cf
            r3 = 0
            long r4 = r0.getLong(r3)
            r3 = 7
            int r3 = r0.getInt(r3)
            if (r3 == 0) goto L_0x02d0
            r3 = r15
            goto L_0x02d1
        L_0x02d0:
            r3 = 0
        L_0x02d1:
            ai3 r7 = new ai3
            r7.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7.Y = r6
            java.lang.String r6 = r0.getString(r15)
            if (r6 == 0) goto L_0x03c7
            r7.a = r6
            long r8 = r0.getLong(r10)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r7.o = r6
            r8 = 3
            long r18 = r0.getLong(r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r18)
            r7.X = r6
            if (r3 == 0) goto L_0x0320
            i05 r3 = new i05
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x0309
            i15 r9 = defpackage.gqc.Y
        L_0x0307:
            r13 = 5
            goto L_0x0310
        L_0x0309:
            i15 r13 = new i15
            r13.<init>(r9)
            r9 = r13
            goto L_0x0307
        L_0x0310:
            byte[] r6 = r0.getBlob(r13)
            r3.<init>(r9, r6)
            r7.c = r3
            r21 = r1
            r1 = r15
            r2 = 6
            r8 = 0
            goto L_0x0399
        L_0x0320:
            r13 = 5
            i05 r3 = new i05
            r6 = 4
            java.lang.String r9 = r0.getString(r6)
            if (r9 != 0) goto L_0x032d
            i15 r9 = defpackage.gqc.Y
            goto L_0x0333
        L_0x032d:
            i15 r6 = new i15
            r6.<init>(r9)
            r9 = r6
        L_0x0333:
            android.database.sqlite.SQLiteDatabase r17 = r14.m()
            java.lang.String[] r19 = new java.lang.String[]{r1}
            java.lang.String r6 = java.lang.String.valueOf(r4)
            java.lang.String[] r21 = new java.lang.String[]{r6}
            r23 = 0
            java.lang.String r24 = "sequence_num"
            java.lang.String r18 = "event_payloads"
            java.lang.String r20 = "event_id = ?"
            r22 = 0
            android.database.Cursor r6 = r17.query(r18, r19, r20, r21, r22, r23, r24)
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x03c2 }
            r8.<init>()     // Catch:{ all -> 0x03c2 }
            r10 = 0
        L_0x0357:
            boolean r18 = r6.moveToNext()     // Catch:{ all -> 0x03c2 }
            if (r18 == 0) goto L_0x036a
            r13 = 0
            byte[] r2 = r6.getBlob(r13)     // Catch:{ all -> 0x03c2 }
            r8.add(r2)     // Catch:{ all -> 0x03c2 }
            int r2 = r2.length     // Catch:{ all -> 0x03c2 }
            int r10 = r10 + r2
            r2 = 0
            r13 = 5
            goto L_0x0357
        L_0x036a:
            byte[] r2 = new byte[r10]     // Catch:{ all -> 0x03c2 }
            r10 = 0
            r13 = 0
        L_0x036e:
            int r15 = r8.size()     // Catch:{ all -> 0x03c2 }
            if (r10 >= r15) goto L_0x038c
            java.lang.Object r15 = r8.get(r10)     // Catch:{ all -> 0x03c2 }
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x03c2 }
            r21 = r1
            int r1 = r15.length     // Catch:{ all -> 0x03c2 }
            r26 = r8
            r8 = 0
            java.lang.System.arraycopy(r15, r8, r2, r13, r1)     // Catch:{ all -> 0x03c2 }
            int r1 = r15.length     // Catch:{ all -> 0x03c2 }
            int r13 = r13 + r1
            r1 = 1
            int r10 = r10 + r1
            r8 = r26
            r1 = r21
            goto L_0x036e
        L_0x038c:
            r21 = r1
            r1 = 1
            r8 = 0
            r6.close()
            r3.<init>(r9, r2)
            r7.c = r3
            r2 = 6
        L_0x0399:
            boolean r3 = r0.isNull(r2)
            if (r3 != 0) goto L_0x03a9
            int r3 = r0.getInt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7.b = r3
        L_0x03a9:
            ja0 r3 = r7.c()
            fb0 r6 = new fb0
            r7 = r11
            hc0 r7 = (defpackage.hc0) r7
            r6.<init>(r4, r7, r3)
            r3 = r12
            java.util.List r3 = (java.util.List) r3
            r3.add(r6)
            r15 = r1
            r1 = r21
            r2 = 0
            r10 = 2
            goto L_0x02bc
        L_0x03c2:
            r0 = move-exception
            r6.close()
            throw r0
        L_0x03c7:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null transportName"
            r0.<init>(r1)
            throw r0
        L_0x03cf:
            r0 = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.m137apply(java.lang.Object):java.lang.Object");
    }

    public void b(oh8 oh8) {
        Bundle bundle = (Bundle) this.c;
        si8 si8 = (si8) this.b;
        if (bundle == null) {
            si8.getClass();
            Bundle bundle2 = Bundle.EMPTY;
        }
        ew6 m = si8.f.m(oh8);
        ResultReceiver resultReceiver = (ResultReceiver) this.o;
        if (resultReceiver != null) {
            m.d(new vs5(m, 21, resultReceiver), nk4.a);
        }
    }

    public void c(qr6 qr6, int i) {
        w98 w98 = (w98) this.b;
        w98.getClass();
        qr6.p0(w98.c, i, ((y9d) this.c).b(), (Bundle) this.o);
    }

    public void d(Throwable th) {
        FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.b;
        frgContactAvatar.getClass();
        ZoomableDraweeView zoomableDraweeView = (ZoomableDraweeView) this.c;
        zoomableDraweeView.setZoomEnabled(false);
        frgContactAvatar.I1 = true;
        if (th != null && th.getMessage() != null && th.getMessage().contains("404")) {
            zoomableDraweeView.setVisibility(8);
            ((SlideOutLayout) this.o).findViewById(xxb.frg_unknown_attach__deleted_view).setVisibility(0);
        } else if (((lqf) ((zp) ((y8a) vl.b()).getAccessor().c(zp.class))).c()) {
            vl vlVar = vl.o;
            a14.N(1, vlVar, vlVar.getString(jpc.G));
        }
    }

    public void e(ez9 ez9) {
        vy7 vy7 = (vy7) this.b;
        vy7.getClass();
        vy7.a();
        if (!ez9.h()) {
            Map map = vy7.a;
            i08 i08 = (i08) this.c;
            sy7 sy7 = (sy7) map.get(i08);
            if (sy7 == null) {
                sy7 = vy7.b((Context) this.o, i08, false, false);
            }
            ez9.d(sy7.b);
        }
        ez9.b();
    }

    public void f() {
        k8b k8b;
        AtomicReference atomicReference = ((q8b) ((sy4) this.b).b).u0;
        while (true) {
            k8b = (k8b) this.c;
            if (!atomicReference.compareAndSet(k8b, (Object) null)) {
                if (atomicReference.get() != k8b) {
                    break;
                }
            } else {
                k8b.b(p8b.a);
                break;
            }
        }
        b76 b76 = k8b.e;
        if (b76 != null) {
            b76.cancel(false);
            k8b.e = null;
        }
        ((ax1) this.o).f().l(k8b);
    }

    public void g(cc0 cc0) {
        pu9 pu9;
        sy4 sy4 = (sy4) this.b;
        sy4.getClass();
        Objects.toString(cc0);
        boolean z = ((ax1) this.c).p().g() == 0;
        q8b q8b = (q8b) sy4.b;
        l8b l8b = q8b.o;
        Size size = ((see) this.o).b;
        l8b.getClass();
        Objects.toString(cc0);
        Objects.toString(size);
        l8b.b = cc0.a;
        l8b.c = cc0.b;
        int i = cc0.c;
        l8b.e = i;
        l8b.a = size;
        l8b.f = z;
        l8b.g = cc0.d;
        l8b.d = cc0.e;
        if (i == -1 || ((pu9 = q8b.b) != null && (pu9 instanceof wee))) {
            q8b.s0 = true;
        } else {
            q8b.s0 = false;
        }
        q8b.b();
    }

    public Object get() {
        nr7 nr7 = (nr7) this.b;
        nr7.getClass();
        return new ak6((me6) ((je7) this.c).getValue(), nr7, (Context) this.o);
    }

    public void h(eje eje, int i) {
        ed7 ed7 = (ed7) this.b;
        int selectedTabPosition = ed7.getSelectedTabPosition();
        View view = eje.e;
        dd7 dd7 = view instanceof dd7 ? (dd7) view : null;
        fd7 fd7 = (fd7) this.c;
        if (i > y53.L((List) fd7.a)) {
            String name = fd7.class.getName();
            int size = ((List) fd7.a).size();
            hm9.m0(name, "Keyboard media tabs position wrong, pos:" + i + "|size:" + size, new Object[0]);
            return;
        }
        bd7 bd7 = (bd7) ((List) fd7.a).get(i);
        Context context = ((ViewPager2) this.o).getContext();
        int i2 = 1;
        boolean z = i == selectedTabPosition;
        String valueOf = String.valueOf(bd7.c);
        String string = context.getString(bd7.a);
        if (!z) {
            i2 = 2;
        }
        y5a y5a = new y5a(valueOf, i2, 56, string);
        if (dd7 != null) {
            dd7.setTabItem(y5a);
            return;
        }
        dd7 dd72 = new dd7(ed7.getContext());
        dd72.setTabItem(y5a);
        eje.e = dd72;
        gje gje = eje.g;
        if (gje != null) {
            gje.e();
        }
    }

    public void i(m7 m7Var) {
        u31 u31 = (u31) this.b;
        u31.getClass();
        o11 o11 = ((j11) this.c).M0;
        if (o11 != null) {
            int id = m7Var.getId();
            bc7[] bc7Arr = CallBottomPanelWidget.s0;
            ((CallBottomPanelWidget) ((sy4) o11).b).n0().r().l(((a51) ((List) this.o).get(id)).b());
        }
        cu3 cu3 = u31.a;
        if (cu3 != null) {
            cu3.dismiss();
        }
        u31.a = null;
    }

    public void invoke(Object obj) {
        ((n3b) obj).q(((m4b) ((ai3) this.b).a).c.a, ((m4b) ((ai3) this.c).a).c.a, ((Integer) this.o).intValue());
    }

    public void j(nqd nqd) {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                y00 y00 = (y00) obj3;
                y00.getClass();
                Locale locale = Locale.ENGLISH;
                String i = zr6.i("preview_", ((l20) obj2).r, "_.png");
                kk5 kk5 = (kk5) y00.c;
                kk5.getClass();
                File g = kk5.g(kk5.b(), "previewVideoCache");
                if (pag.k(g)) {
                    File file = new File(g, i);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        Uri fromFile = Uri.fromFile(file);
                        iv6 o2 = s36.o();
                        o2.getClass();
                        z16 z16 = new z16(7, fromFile);
                        o2.f.n(z16);
                        o2.g.n(z16);
                        o2.f(wv6.a(fromFile), (t68) null);
                        if (!nqd.h()) {
                            nqd.a(file);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        break;
                    }
                } else if (!nqd.h()) {
                    nqd.onError(new IllegalStateException("Preview cache directory not exist or can't read"));
                    return;
                } else {
                    return;
                }
            case 20:
                Context context = ((bn0) obj3).a;
                int f = a14.f(context);
                Bitmap bitmap2 = new zn0(context, (Uri) obj2, (Uri) null, f, f, (qqd) null).d().a;
                if (bitmap2 != null) {
                    Bitmap bitmap3 = new zn0(context, (Uri) obj, (Uri) null, f, f, (qqd) null).d().a;
                    if (bitmap3 != null) {
                        int i2 = c37.h;
                        Canvas canvas = new Canvas(bitmap2);
                        float width = ((float) bitmap2.getWidth()) / ((float) bitmap3.getWidth());
                        canvas.scale(width, width);
                        canvas.drawBitmap(bitmap3, 0.0f, 0.0f, (Paint) null);
                        kk5 h = ((y8a) vl.b()).h();
                        h.getClass();
                        File o3 = h.o((String) null, "jpg");
                        String absolutePath = o3.getAbsolutePath();
                        ph4 ph4 = j47.X;
                        j47.h0(absolutePath, bitmap2, 100, Bitmap.CompressFormat.JPEG);
                        String absolutePath2 = o3.getAbsolutePath();
                        bitmap2.recycle();
                        if (!nqd.h()) {
                            nqd.a(Uri.fromFile(new File(absolutePath2)));
                            return;
                        }
                        return;
                    } else if (!nqd.h()) {
                        nqd.onError(new IllegalStateException("overlayBitmap not decoded"));
                        return;
                    } else {
                        return;
                    }
                } else if (!nqd.h()) {
                    nqd.onError(new IllegalStateException("bitmap not decoded"));
                    return;
                } else {
                    return;
                }
            default:
                c7f c7f = (c7f) obj3;
                c7f.getClass();
                v6f v6f = (v6f) obj2;
                hm9.m("c7f", "copyFromUri: started for uri=%s", v6f.a.a);
                d7f d7f = v6f.a;
                it3 it3 = (it3) obj;
                String a2 = ((cj0) ((af8) c7f.g.g.getValue())).a(d7f.a, it3.c);
                if (kj6.h(a2)) {
                    hm9.m("c7f", "copyFromUri: finished for uri=%s", d7f.a);
                    if (!nqd.h()) {
                        u6f b2 = v6f.b();
                        b2.b = a2;
                        b2.c = it3.c;
                        b2.f = it3.b;
                        nqd.a(new v6f(b2));
                        return;
                    }
                    return;
                } else if (!nqd.h()) {
                    nqd.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
        }
        throw th;
    }

    public ukg k(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str2 = (String) this.c;
        t8e t8e = (t8e) this.o;
        String str3 = (String) obj;
        re6 c2 = FirebaseMessaging.c(firebaseMessaging.b);
        String d = firebaseMessaging.d();
        String g = firebaseMessaging.h.g();
        synchronized (c2) {
            long currentTimeMillis = System.currentTimeMillis();
            int i = t8e.e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ApiProtocol.KEY_TOKEN, (Object) str3);
                jSONObject.put("appVersion", (Object) g);
                jSONObject.put("timestamp", currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                edit.putString(re6.m0(d, str2), str);
                edit.commit();
            }
        }
        if (t8e == null || !str3.equals(t8e.a)) {
            fl5 fl5 = firebaseMessaging.a;
            fl5.a();
            if ("[DEFAULT]".equals(fl5.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    fl5.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(ApiProtocol.KEY_TOKEN, str3);
                new imc(firebaseMessaging.b, 1).Y(intent);
            }
        }
        return j1e.r(str3);
    }

    public void onComplete(StatsReport[] statsReportArr) {
        kk4 kk4 = (kk4) this.b;
        kk4.getClass();
        ArrayList arrayList = new ArrayList();
        for (StatsReport statsReport : statsReportArr) {
            if ("ssrc".equals(statsReport.type)) {
                arrayList.add(statsReport);
            }
        }
        kk4.a.post(new vq1(kk4, statsReportArr, (StatsReport[]) arrayList.toArray(new StatsReport[arrayList.size()]), (bg1) this.c, (y1e) this.o, 4));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [a76, java.lang.Object, ar0] */
    public String q(lq1 lq1) {
        switch (this.a) {
            case 5:
                ce4 ce4 = (ce4) this.b;
                ce4.getClass();
                ce4.e(new yg3((Object) ce4, (Object) (eu4) this.c, (Object) (Map) this.o, (Object) lq1, 2), new kc(5));
                return "Init GlRenderer";
            case 6:
                bm7 bm7 = (bm7) this.b;
                dd4 dd4 = new dd4(4, (oq1) bm7);
                Executor executor = (Executor) this.c;
                lq1.a(dd4, executor);
                ? obj = new Object();
                obj.a = false;
                obj.b = lq1;
                kq0.a(bm7, obj, executor);
                return "surfaceList[" + ((Collection) this.o) + "]";
            case 8:
                vs4 vs4 = (vs4) this.b;
                vs4.getClass();
                vs4.e(new yg3((Object) vs4, (Object) (eu4) this.c, (Object) (Map) this.o, (Object) lq1, 4), new kc(5));
                return "Init GlRenderer";
            default:
                ((k8b) this.b).getClass();
                yw1 yw1 = (yw1) this.c;
                pt1 pt1 = new pt1(lq1, yw1);
                ((List) this.o).add(pt1);
                yw1.n(ju0.k(), pt1);
                return "waitForCaptureResult";
        }
    }

    public /* synthetic */ u00(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX WARNING: type inference failed for: r3v21, types: [java.lang.Object, bm7] */
    /* JADX WARNING: type inference failed for: r1v26, types: [java.lang.Object, bm7] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01b7 A[Catch:{ CameraAccessException -> 0x02ba, all -> 0x00b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01de A[Catch:{ CameraAccessException -> 0x02ba, all -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.bm7 apply(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r2 = 11
            r3 = 19
            r4 = 2
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 2: goto L_0x0078;
                case 18: goto L_0x0045;
                default: goto L_0x000e;
            }
        L_0x000e:
            r12 = r23
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r1 = r0.b
            ii8 r1 = (defpackage.ii8) r1
            android.os.Handler r4 = r1.l
            yg3 r6 = new yg3
            java.lang.Object r7 = r0.o
            r10 = r7
            qj8 r10 = (defpackage.qj8) r10
            java.lang.Object r0 = r0.c
            oh8 r0 = (defpackage.oh8) r0
            r13 = 11
            r8 = r6
            r9 = r1
            r11 = r0
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (int) r13)
            vs5 r7 = new vs5
            r7.<init>(r1, r0, r6, r3)
            sad r0 = new sad
            r0.<init>(r5)
            int r1 = defpackage.oaf.a
            ccd r1 = new ccd
            r1.<init>()
            ewc r3 = new ewc
            r3.<init>(r1, r7, r0, r2)
            defpackage.oaf.W(r4, r3)
            return r1
        L_0x0045:
            r1 = r23
            ph8 r1 = (defpackage.ph8) r1
            java.lang.Object r4 = r0.b
            ii8 r4 = (defpackage.ii8) r4
            android.os.Handler r6 = r4.l
            v05 r7 = new v05
            java.lang.Object r8 = r0.o
            hj8 r8 = (defpackage.hj8) r8
            r9 = 16
            r7.<init>((java.lang.Object) r4, (java.lang.Object) r8, (java.lang.Object) r1, (int) r9)
            vs5 r1 = new vs5
            java.lang.Object r0 = r0.c
            oh8 r0 = (defpackage.oh8) r0
            r1.<init>(r4, r0, r7, r3)
            sad r0 = new sad
            r0.<init>(r5)
            int r3 = defpackage.oaf.a
            ccd r3 = new ccd
            r3.<init>()
            ewc r4 = new ewc
            r4.<init>(r3, r1, r0, r2)
            defpackage.oaf.W(r6, r4)
            return r3
        L_0x0078:
            java.lang.String r2 = "openCaptureSession() should not be possible in state: "
            java.lang.String r3 = "openCaptureSession() not execute in state: "
            java.lang.Object r7 = r0.b
            sz1 r7 = (defpackage.sz1) r7
            java.lang.Object r8 = r0.c
            fad r8 = (defpackage.fad) r8
            java.lang.Object r0 = r0.o
            android.hardware.camera2.CameraDevice r0 = (android.hardware.camera2.CameraDevice) r0
            r9 = r23
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r7.a
            monitor-enter(r10)
            int r11 = r7.i     // Catch:{ all -> 0x00b5 }
            int r11 = defpackage.au1.s(r11)     // Catch:{ all -> 0x00b5 }
            if (r11 == 0) goto L_0x02c3
            if (r11 == r6) goto L_0x02c3
            r12 = 4
            if (r11 == r4) goto L_0x00b8
            if (r11 == r12) goto L_0x02c3
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.wg0.t(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r3.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            dw6 r1 = new dw6     // Catch:{ all -> 0x00b5 }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x00b5:
            r0 = move-exception
            goto L_0x02da
        L_0x00b8:
            java.util.HashMap r2 = r7.g     // Catch:{ all -> 0x00b5 }
            r2.clear()     // Catch:{ all -> 0x00b5 }
            r2 = r5
        L_0x00be:
            int r3 = r9.size()     // Catch:{ all -> 0x00b5 }
            if (r2 >= r3) goto L_0x00d9
            java.util.HashMap r3 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r7.h     // Catch:{ all -> 0x00b5 }
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x00b5 }
            xf4 r11 = (defpackage.xf4) r11     // Catch:{ all -> 0x00b5 }
            java.lang.Object r13 = r9.get(r2)     // Catch:{ all -> 0x00b5 }
            android.view.Surface r13 = (android.view.Surface) r13     // Catch:{ all -> 0x00b5 }
            r3.put(r11, r13)     // Catch:{ all -> 0x00b5 }
            int r2 = r2 + r6
            goto L_0x00be
        L_0x00d9:
            r7.i = r12     // Catch:{ all -> 0x00b5 }
            rz1 r2 = r7.c     // Catch:{ all -> 0x00b5 }
            rz1 r3 = new rz1     // Catch:{ all -> 0x00b5 }
            java.util.List r9 = r8.d     // Catch:{ all -> 0x00b5 }
            r3.<init>(r6, r9)     // Catch:{ all -> 0x00b5 }
            ghe[] r9 = new defpackage.ghe[r4]     // Catch:{ all -> 0x00b5 }
            r9[r5] = r2     // Catch:{ all -> 0x00b5 }
            r9[r6] = r3     // Catch:{ all -> 0x00b5 }
            rz1 r2 = new rz1     // Catch:{ all -> 0x00b5 }
            java.util.List r3 = java.util.Arrays.asList(r9)     // Catch:{ all -> 0x00b5 }
            r2.<init>(r4, r3)     // Catch:{ all -> 0x00b5 }
            cv1 r3 = new cv1     // Catch:{ all -> 0x00b5 }
            kz1 r4 = r8.g     // Catch:{ all -> 0x00b5 }
            ce3 r5 = r4.b     // Catch:{ all -> 0x00b5 }
            r9 = 8
            r3.<init>((int) r9, (java.lang.Object) r5)     // Catch:{ all -> 0x00b5 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x00b5 }
            r5.<init>()     // Catch:{ all -> 0x00b5 }
            defpackage.mi9.b()     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r9.<init>()     // Catch:{ all -> 0x00b5 }
            defpackage.ui9.a()     // Catch:{ all -> 0x00b5 }
            java.util.List r11 = r4.a     // Catch:{ all -> 0x00b5 }
            r5.addAll(r11)     // Catch:{ all -> 0x00b5 }
            ce3 r11 = r4.b     // Catch:{ all -> 0x00b5 }
            mi9 r11 = defpackage.mi9.c(r11)     // Catch:{ all -> 0x00b5 }
            int r15 = r4.c     // Catch:{ all -> 0x00b5 }
            java.util.List r12 = r4.e     // Catch:{ all -> 0x00b5 }
            r9.addAll(r12)     // Catch:{ all -> 0x00b5 }
            boolean r14 = r4.f     // Catch:{ all -> 0x00b5 }
            android.util.ArrayMap r12 = new android.util.ArrayMap     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            nje r13 = r4.g     // Catch:{ all -> 0x00b5 }
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.util.Set r6 = r6.keySet()     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x0133:
            boolean r16 = r6.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x014f
            java.lang.Object r16 = r6.next()     // Catch:{ all -> 0x00b5 }
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00b5 }
            r22 = r6
            java.util.Map r6 = r13.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ all -> 0x00b5 }
            r12.put(r1, r6)     // Catch:{ all -> 0x00b5 }
            r6 = r22
            goto L_0x0133
        L_0x014f:
            ui9 r1 = new ui9     // Catch:{ all -> 0x00b5 }
            r1.<init>(r12)     // Catch:{ all -> 0x00b5 }
            boolean r4 = r4.d     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00b5 }
            r6.<init>()     // Catch:{ all -> 0x00b5 }
            boolean r12 = r7.r     // Catch:{ all -> 0x00b5 }
            r13 = 35
            if (r12 == 0) goto L_0x0173
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            if (r12 < r13) goto L_0x0173
            java.util.List r6 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = defpackage.sz1.g(r6)     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r12 = r7.g     // Catch:{ all -> 0x00b5 }
            java.util.HashMap r6 = defpackage.sz1.c(r6, r12)     // Catch:{ all -> 0x00b5 }
        L_0x0173:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x00b5 }
            r12.<init>()     // Catch:{ all -> 0x00b5 }
            aa0 r13 = defpackage.cv1.w0     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x00b5 }
            ce3 r3 = (defpackage.ce3) r3     // Catch:{ all -> 0x00b5 }
            r21 = r0
            r0 = 0
            java.lang.Object r3 = r3.f(r13, r0)     // Catch:{ all -> 0x00b5 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00b5 }
            java.util.List r13 = r8.a     // Catch:{ all -> 0x00b5 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x00b5 }
        L_0x018d:
            boolean r16 = r13.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r16 == 0) goto L_0x01ed
            java.lang.Object r16 = r13.next()     // Catch:{ all -> 0x00b5 }
            r0 = r16
            rb0 r0 = (defpackage.rb0) r0     // Catch:{ all -> 0x00b5 }
            r23 = r13
            boolean r13 = r7.r     // Catch:{ all -> 0x00b5 }
            if (r13 == 0) goto L_0x01b0
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r16 = r14
            r14 = 35
            if (r13 < r14) goto L_0x01b4
            java.lang.Object r13 = r6.get(r0)     // Catch:{ all -> 0x00b5 }
            tna r13 = (defpackage.tna) r13     // Catch:{ all -> 0x00b5 }
            goto L_0x01b5
        L_0x01b0:
            r16 = r14
            r14 = 35
        L_0x01b4:
            r13 = 0
        L_0x01b5:
            if (r13 != 0) goto L_0x01de
            java.util.HashMap r13 = r7.g     // Catch:{ all -> 0x00b5 }
            tna r13 = r7.e(r0, r13, r3)     // Catch:{ all -> 0x00b5 }
            java.util.Map r14 = r7.l     // Catch:{ all -> 0x00b5 }
            r17 = r3
            xf4 r3 = r0.a     // Catch:{ all -> 0x00b5 }
            boolean r3 = r14.containsKey(r3)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x01e0
            java.util.Map r3 = r7.l     // Catch:{ all -> 0x00b5 }
            xf4 r0 = r0.a     // Catch:{ all -> 0x00b5 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x00b5 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x00b5 }
            r3 = r15
            long r14 = r0.longValue()     // Catch:{ all -> 0x00b5 }
            vna r0 = r13.a     // Catch:{ all -> 0x00b5 }
            r0.h(r14)     // Catch:{ all -> 0x00b5 }
            goto L_0x01e1
        L_0x01de:
            r17 = r3
        L_0x01e0:
            r3 = r15
        L_0x01e1:
            r12.add(r13)     // Catch:{ all -> 0x00b5 }
            r13 = r23
            r15 = r3
            r14 = r16
            r3 = r17
            r0 = 0
            goto L_0x018d
        L_0x01ed:
            r16 = r14
            r3 = r15
            java.util.ArrayList r0 = defpackage.sz1.f(r12)     // Catch:{ all -> 0x00b5 }
            ihe r6 = r7.d     // Catch:{ all -> 0x00b5 }
            int r12 = r8.h     // Catch:{ all -> 0x00b5 }
            r6.e = r2     // Catch:{ all -> 0x00b5 }
            had r2 = new had     // Catch:{ all -> 0x00b5 }
            rv1 r13 = new rv1     // Catch:{ all -> 0x00b5 }
            r14 = r6
            jhe r14 = (defpackage.jhe) r14     // Catch:{ all -> 0x00b5 }
            r15 = 1
            r13.<init>(r15, r14)     // Catch:{ all -> 0x00b5 }
            java.util.concurrent.Executor r6 = r6.c     // Catch:{ all -> 0x00b5 }
            r2.<init>(r12, r0, r6, r13)     // Catch:{ all -> 0x00b5 }
            kz1 r0 = r8.g     // Catch:{ all -> 0x00b5 }
            int r0 = r0.c     // Catch:{ all -> 0x00b5 }
            r6 = 5
            if (r0 != r6) goto L_0x0242
            android.hardware.camera2.params.InputConfiguration r0 = r8.i     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x0242
            if (r0 != 0) goto L_0x0219
            r6 = 0
            goto L_0x0234
        L_0x0219:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b5 }
            r8 = 31
            if (r6 < r8) goto L_0x022a
            j17 r6 = new j17     // Catch:{ all -> 0x00b5 }
            i17 r8 = new i17     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
            goto L_0x0234
        L_0x022a:
            j17 r6 = new j17     // Catch:{ all -> 0x00b5 }
            h17 r8 = new h17     // Catch:{ all -> 0x00b5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00b5 }
            r6.<init>(r8)     // Catch:{ all -> 0x00b5 }
        L_0x0234:
            gad r0 = r2.a     // Catch:{ all -> 0x00b5 }
            r0.getClass()     // Catch:{ all -> 0x00b5 }
            h17 r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.InputConfiguration r6 = r6.a     // Catch:{ all -> 0x00b5 }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ all -> 0x00b5 }
            r0.setInputConfiguration(r6)     // Catch:{ all -> 0x00b5 }
        L_0x0242:
            kz1 r12 = new kz1     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02ba }
            r13.<init>(r5)     // Catch:{ CameraAccessException -> 0x02ba }
            wma r0 = defpackage.wma.a(r11)     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x02ba }
            r5.<init>(r9)     // Catch:{ CameraAccessException -> 0x02ba }
            nje r6 = defpackage.nje.b     // Catch:{ CameraAccessException -> 0x02ba }
            android.util.ArrayMap r6 = new android.util.ArrayMap     // Catch:{ CameraAccessException -> 0x02ba }
            r6.<init>()     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Map r8 = r1.a     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Set r8 = r8.keySet()     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x0263:
            boolean r9 = r8.hasNext()     // Catch:{ CameraAccessException -> 0x02ba }
            if (r9 == 0) goto L_0x0279
            java.lang.Object r9 = r8.next()     // Catch:{ CameraAccessException -> 0x02ba }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ CameraAccessException -> 0x02ba }
            java.util.Map r11 = r1.a     // Catch:{ CameraAccessException -> 0x02ba }
            java.lang.Object r11 = r11.get(r9)     // Catch:{ CameraAccessException -> 0x02ba }
            r6.put(r9, r11)     // Catch:{ CameraAccessException -> 0x02ba }
            goto L_0x0263
        L_0x0279:
            nje r1 = new nje     // Catch:{ CameraAccessException -> 0x02ba }
            r1.<init>(r6)     // Catch:{ CameraAccessException -> 0x02ba }
            r20 = 0
            r6 = r16
            r14 = r0
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ CameraAccessException -> 0x02ba }
            oq0 r1 = r7.q     // Catch:{ CameraAccessException -> 0x02ba }
            if (r21 != 0) goto L_0x0297
            r4 = r21
            r1 = 0
            goto L_0x02a7
        L_0x0297:
            r4 = r21
            android.hardware.camera2.CaptureRequest$Builder r5 = r4.createCaptureRequest(r3)     // Catch:{ CameraAccessException -> 0x02ba }
            defpackage.oag.c(r5, r3, r1)     // Catch:{ CameraAccessException -> 0x02ba }
            defpackage.oag.b(r5, r0)     // Catch:{ CameraAccessException -> 0x02ba }
            android.hardware.camera2.CaptureRequest r1 = r5.build()     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x02a7:
            if (r1 == 0) goto L_0x02b0
            gad r0 = r2.a     // Catch:{ CameraAccessException -> 0x02ba }
            android.hardware.camera2.params.SessionConfiguration r0 = r0.a     // Catch:{ CameraAccessException -> 0x02ba }
            r0.setSessionParameters(r1)     // Catch:{ CameraAccessException -> 0x02ba }
        L_0x02b0:
            ihe r0 = r7.d     // Catch:{ all -> 0x00b5 }
            java.util.List r1 = r7.h     // Catch:{ all -> 0x00b5 }
            bm7 r1 = r0.m(r4, r2, r1)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x02ba:
            r0 = move-exception
            dw6 r1 = new dw6     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            goto L_0x02d9
        L_0x02c3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            int r1 = r7.i     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = defpackage.wg0.t(r1)     // Catch:{ all -> 0x00b5 }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x00b5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00b5 }
            dw6 r1 = new dw6     // Catch:{ all -> 0x00b5 }
            r2 = 1
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
        L_0x02d9:
            return r1
        L_0x02da:
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u00.apply(java.lang.Object):bm7");
    }
}
