package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: uh  reason: default package */
public final class uh implements Callable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uh(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX INFO: finally extract failed */
    private final Object a() {
        alc alc = (alc) this.c;
        ilc ilc = alc.a;
        ilc.c();
        try {
            alc.c.B((List) this.b);
            ilc.r();
            ilc.l();
            return e5f.a;
        } catch (Throwable th) {
            ilc.l();
            throw th;
        }
    }

    private final Object b() {
        Cursor o = ((ilc) ((w4d) this.c).b).o((xlc) this.b, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "selectedMentionType");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                long j = o.getLong(n);
                int i = o.getInt(n2);
                int i2 = 1;
                if (i != 0) {
                    if (i == 1) {
                        i2 = 2;
                    }
                }
                arrayList.add(new v4d(j, i2));
            }
            return arrayList;
        } finally {
            o.close();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Object c() {
        b4e b4e = (b4e) this.c;
        ilc ilc = b4e.a;
        ilc.c();
        try {
            b4e.b.B((List) this.b);
            ilc.r();
            ilc.l();
            return null;
        } catch (Throwable th) {
            ilc.l();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [r3e, java.lang.Object] */
    private final Object d() {
        Cursor o = ((b4e) this.c).a.o((xlc) this.b, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "name");
            int n3 = tfg.n(o, "icon_url");
            int n4 = tfg.n(o, "author_id");
            int n5 = tfg.n(o, "created_time");
            int n6 = tfg.n(o, "updated_time");
            int n7 = tfg.n(o, "link");
            int n8 = tfg.n(o, "stickers");
            int n9 = tfg.n(o, "draft");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                ? obj = new Object();
                obj.a = o.getLong(n);
                if (o.isNull(n2)) {
                    obj.b = null;
                } else {
                    obj.b = o.getString(n2);
                }
                if (o.isNull(n3)) {
                    obj.c = null;
                } else {
                    obj.c = o.getString(n3);
                }
                obj.d = o.getLong(n4);
                obj.e = o.getLong(n5);
                obj.f = o.getLong(n6);
                if (o.isNull(n7)) {
                    obj.g = null;
                } else {
                    obj.g = o.getString(n7);
                }
                obj.h = ngg.I(o.isNull(n8) ? null : o.getString(n8));
                obj.i = o.getInt(n9) != 0;
                arrayList.add(obj);
            }
            o.close();
            return arrayList;
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    private final Object e() {
        w8f w8f = (w8f) this.c;
        ilc ilc = w8f.a;
        ilc.c();
        try {
            w8f.b.C((e7f) this.b);
            ilc.r();
            ilc.l();
            return null;
        } catch (Throwable th) {
            ilc.l();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r9v2, types: [ec1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v33, types: [vx9] */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r44 = this;
            r0 = r44
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "push_id"
            java.lang.String r3 = "message_id"
            java.lang.String r4 = "update_time"
            java.lang.String r5 = "time"
            java.lang.String r6 = "id"
            java.lang.String r8 = "chat_id"
            e5f r9 = defpackage.e5f.a
            r10 = 1
            r11 = 0
            java.lang.Object r12 = r0.c
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x0750;
                case 1: goto L_0x0734;
                case 2: goto L_0x069c;
                case 3: goto L_0x0668;
                case 4: goto L_0x0605;
                case 5: goto L_0x05e8;
                case 6: goto L_0x05ad;
                case 7: goto L_0x0572;
                case 8: goto L_0x0556;
                case 9: goto L_0x0439;
                case 10: goto L_0x041d;
                case 11: goto L_0x03d5;
                case 12: goto L_0x03b8;
                case 13: goto L_0x0392;
                case 14: goto L_0x028a;
                case 15: goto L_0x026e;
                case 16: goto L_0x0227;
                case 17: goto L_0x018d;
                case 18: goto L_0x016d;
                case 19: goto L_0x0114;
                case 20: goto L_0x00f8;
                case 21: goto L_0x00a2;
                case 22: goto L_0x0086;
                case 23: goto L_0x0065;
                case 24: goto L_0x0060;
                case 25: goto L_0x005b;
                case 26: goto L_0x0056;
                case 27: goto L_0x0051;
                case 28: goto L_0x004c;
                default: goto L_0x001b;
            }
        L_0x001b:
            w8f r12 = (defpackage.w8f) r12
            zkc r1 = r12.e
            ilc r2 = r12.a
            q36 r3 = r1.f()
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x002f
            r3.W(r10)
            goto L_0x0032
        L_0x002f:
            r3.f(r10, r0)
        L_0x0032:
            r2.c()     // Catch:{ all -> 0x0047 }
            r3.n()     // Catch:{ all -> 0x0042 }
            r2.r()     // Catch:{ all -> 0x0042 }
            r2.l()     // Catch:{ all -> 0x0047 }
            r1.t(r3)
            return r11
        L_0x0042:
            r0 = move-exception
            r2.l()     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            r1.t(r3)
            throw r0
        L_0x004c:
            java.lang.Object r0 = r44.e()
            return r0
        L_0x0051:
            java.lang.Object r0 = r44.d()
            return r0
        L_0x0056:
            java.lang.Object r0 = r44.c()
            return r0
        L_0x005b:
            java.lang.Object r0 = r44.b()
            return r0
        L_0x0060:
            java.lang.Object r0 = r44.a()
            return r0
        L_0x0065:
            alc r12 = (defpackage.alc) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0081 }
            nkc r0 = (defpackage.nkc) r0     // Catch:{ all -> 0x0081 }
            long r2 = r2.D(r0)     // Catch:{ all -> 0x0081 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0081 }
            r1.r()     // Catch:{ all -> 0x0081 }
            r1.l()
            return r0
        L_0x0081:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0086:
            d9c r12 = (defpackage.d9c) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x009d }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x009d }
            e9c r0 = (defpackage.e9c) r0     // Catch:{ all -> 0x009d }
            r2.C(r0)     // Catch:{ all -> 0x009d }
            r1.r()     // Catch:{ all -> 0x009d }
            r1.l()
            return r11
        L_0x009d:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x00a2:
            a7c r12 = (defpackage.a7c) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            xlc r2 = (defpackage.xlc) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x00e8 }
            int r3 = defpackage.tfg.n(r1, r4)     // Catch:{ all -> 0x00e8 }
            java.lang.String r4 = "reactions"
            int r4 = defpackage.tfg.n(r1, r4)     // Catch:{ all -> 0x00e8 }
            boolean r5 = r1.moveToFirst()     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00ea
            boolean r5 = r1.isNull(r0)     // Catch:{ all -> 0x00e8 }
            if (r5 == 0) goto L_0x00cb
            r0 = r11
            goto L_0x00cf
        L_0x00cb:
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00e8 }
        L_0x00cf:
            long r5 = r1.getLong(r3)     // Catch:{ all -> 0x00e8 }
            boolean r3 = r1.isNull(r4)     // Catch:{ all -> 0x00e8 }
            if (r3 == 0) goto L_0x00da
            goto L_0x00de
        L_0x00da:
            java.lang.String r11 = r1.getString(r4)     // Catch:{ all -> 0x00e8 }
        L_0x00de:
            java.util.ArrayList r3 = defpackage.ngg.I(r11)     // Catch:{ all -> 0x00e8 }
            z6c r11 = new z6c     // Catch:{ all -> 0x00e8 }
            r11.<init>(r5, r0, r3)     // Catch:{ all -> 0x00e8 }
            goto L_0x00ea
        L_0x00e8:
            r0 = move-exception
            goto L_0x00f1
        L_0x00ea:
            r1.close()
            r2.n()
            return r11
        L_0x00f1:
            r1.close()
            r2.n()
            throw r0
        L_0x00f8:
            a7c r12 = (defpackage.a7c) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x010f }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x010f }
            z6c r0 = (defpackage.z6c) r0     // Catch:{ all -> 0x010f }
            r2.C(r0)     // Catch:{ all -> 0x010f }
            r1.r()     // Catch:{ all -> 0x010f }
            r1.l()
            return r9
        L_0x010f:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0114:
            adb r12 = (defpackage.adb) r12
            java.lang.Object r1 = r12.a
            ilc r1 = (defpackage.ilc) r1
            java.lang.Object r0 = r0.b
            xlc r0 = (defpackage.xlc) r0
            android.database.Cursor r1 = r1.o(r0, r11)
            int r0 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x0163 }
            java.lang.String r2 = "server_id"
            int r2 = defpackage.tfg.n(r1, r2)     // Catch:{ all -> 0x0163 }
            java.lang.String r3 = "profile"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x0163 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0163 }
            int r5 = r1.getCount()     // Catch:{ all -> 0x0163 }
            r4.<init>(r5)     // Catch:{ all -> 0x0163 }
        L_0x013b:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x0163 }
            if (r5 == 0) goto L_0x0165
            long r13 = r1.getLong(r0)     // Catch:{ all -> 0x0163 }
            long r15 = r1.getLong(r2)     // Catch:{ all -> 0x0163 }
            boolean r5 = r1.isNull(r3)     // Catch:{ all -> 0x0163 }
            if (r5 == 0) goto L_0x0151
            r5 = r11
            goto L_0x0155
        L_0x0151:
            byte[] r5 = r1.getBlob(r3)     // Catch:{ all -> 0x0163 }
        L_0x0155:
            bdb r17 = defpackage.fm9.L(r5)     // Catch:{ all -> 0x0163 }
            wgb r5 = new wgb     // Catch:{ all -> 0x0163 }
            r12 = r5
            r12.<init>(r13, r15, r17)     // Catch:{ all -> 0x0163 }
            r4.add(r5)     // Catch:{ all -> 0x0163 }
            goto L_0x013b
        L_0x0163:
            r0 = move-exception
            goto L_0x0169
        L_0x0165:
            r1.close()
            return r4
        L_0x0169:
            r1.close()
            throw r0
        L_0x016d:
            adb r12 = (defpackage.adb) r12
            java.lang.Object r1 = r12.a
            ilc r1 = (defpackage.ilc) r1
            r1.c()
            java.lang.Object r2 = r12.b     // Catch:{ all -> 0x0188 }
            sh r2 = (defpackage.sh) r2     // Catch:{ all -> 0x0188 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0188 }
            wgb r0 = (defpackage.wgb) r0     // Catch:{ all -> 0x0188 }
            r2.C(r0)     // Catch:{ all -> 0x0188 }
            r1.r()     // Catch:{ all -> 0x0188 }
            r1.l()
            return r9
        L_0x0188:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x018d:
            yx9 r12 = (defpackage.yx9) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            xlc r2 = (defpackage.xlc) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x0217 }
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x0217 }
            int r4 = defpackage.tfg.n(r1, r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r5 = "fcm"
            int r5 = defpackage.tfg.n(r1, r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r6 = "drop_reason"
            int r6 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x0217 }
            boolean r8 = r1.moveToFirst()     // Catch:{ all -> 0x0217 }
            if (r8 == 0) goto L_0x0219
            long r13 = r1.getLong(r0)     // Catch:{ all -> 0x0217 }
            long r15 = r1.getLong(r3)     // Catch:{ all -> 0x0217 }
            long r17 = r1.getLong(r4)     // Catch:{ all -> 0x0217 }
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01cc
            r0 = r11
            goto L_0x01d4
        L_0x01cc:
            int r0 = r1.getInt(r5)     // Catch:{ all -> 0x0217 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0217 }
        L_0x01d4:
            if (r0 != 0) goto L_0x01d9
            r19 = r11
            goto L_0x01e8
        L_0x01d9:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01e1
            r0 = r10
            goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0217 }
            r19 = r0
        L_0x01e8:
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01f0
            r0 = r11
            goto L_0x01f4
        L_0x01f0:
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x0217 }
        L_0x01f4:
            ks4[] r3 = defpackage.ks4.b     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x01fb
        L_0x01f8:
            r20 = r11
            goto L_0x0210
        L_0x01fb:
            ks4[] r3 = defpackage.ks4.b     // Catch:{ all -> 0x0217 }
            int r4 = r3.length     // Catch:{ all -> 0x0217 }
            r7 = 0
        L_0x01ff:
            if (r7 >= r4) goto L_0x01f8
            r5 = r3[r7]     // Catch:{ all -> 0x0217 }
            java.lang.String r6 = r5.a     // Catch:{ all -> 0x0217 }
            boolean r6 = defpackage.eae.k0(r6, r0, r10)     // Catch:{ all -> 0x0217 }
            if (r6 == 0) goto L_0x020e
            r20 = r5
            goto L_0x0210
        L_0x020e:
            int r7 = r7 + r10
            goto L_0x01ff
        L_0x0210:
            vx9 r11 = new vx9     // Catch:{ all -> 0x0217 }
            r12 = r11
            r12.<init>(r13, r15, r17, r19, r20)     // Catch:{ all -> 0x0217 }
            goto L_0x0219
        L_0x0217:
            r0 = move-exception
            goto L_0x0220
        L_0x0219:
            r1.close()
            r2.n()
            return r11
        L_0x0220:
            r1.close()
            r2.n()
            throw r0
        L_0x0227:
            kw9 r12 = (defpackage.kw9) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            xlc r2 = (defpackage.xlc) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x025e }
            java.lang.String r3 = "mark"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x025e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x025e }
            int r5 = r1.getCount()     // Catch:{ all -> 0x025e }
            r4.<init>(r5)     // Catch:{ all -> 0x025e }
        L_0x0247:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x025e }
            if (r5 == 0) goto L_0x0260
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x025e }
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x025e }
            qv9 r9 = new qv9     // Catch:{ all -> 0x025e }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x025e }
            r4.add(r9)     // Catch:{ all -> 0x025e }
            goto L_0x0247
        L_0x025e:
            r0 = move-exception
            goto L_0x0267
        L_0x0260:
            r1.close()
            r2.n()
            return r4
        L_0x0267:
            r1.close()
            r2.n()
            throw r0
        L_0x026e:
            ew9 r12 = (defpackage.ew9) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0285 }
            je5 r0 = (defpackage.je5) r0     // Catch:{ all -> 0x0285 }
            r2.C(r0)     // Catch:{ all -> 0x0285 }
            r1.r()     // Catch:{ all -> 0x0285 }
            r1.l()
            return r9
        L_0x0285:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x028a:
            ew9 r12 = (defpackage.ew9) r12
            ilc r4 = r12.a
            java.lang.Object r0 = r0.b
            r6 = r0
            xlc r6 = (defpackage.xlc) r6
            android.database.Cursor r4 = r4.o(r6, r11)
            int r0 = defpackage.tfg.n(r4, r8)     // Catch:{ all -> 0x0388 }
            int r3 = defpackage.tfg.n(r4, r3)     // Catch:{ all -> 0x0388 }
            java.lang.String r8 = "type"
            int r8 = defpackage.tfg.n(r4, r8)     // Catch:{ all -> 0x0388 }
            java.lang.String r9 = "chat_title"
            int r9 = defpackage.tfg.n(r4, r9)     // Catch:{ all -> 0x0388 }
            java.lang.String r12 = "sender_user_name"
            int r12 = defpackage.tfg.n(r4, r12)     // Catch:{ all -> 0x0388 }
            java.lang.String r13 = "sender_user_id"
            int r13 = defpackage.tfg.n(r4, r13)     // Catch:{ all -> 0x0388 }
            int r5 = defpackage.tfg.n(r4, r5)     // Catch:{ all -> 0x0388 }
            java.lang.String r14 = "text"
            int r14 = defpackage.tfg.n(r4, r14)     // Catch:{ all -> 0x0388 }
            int r2 = defpackage.tfg.n(r4, r2)     // Catch:{ all -> 0x0388 }
            int r1 = defpackage.tfg.n(r4, r1)     // Catch:{ all -> 0x0388 }
            java.lang.String r15 = "large_image_url"
            int r15 = defpackage.tfg.n(r4, r15)     // Catch:{ all -> 0x0388 }
            java.lang.String r7 = "fire_m"
            int r7 = defpackage.tfg.n(r4, r7)     // Catch:{ all -> 0x0388 }
            java.lang.String r11 = "has_any_error"
            int r11 = defpackage.tfg.n(r4, r11)     // Catch:{ all -> 0x0388 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0388 }
            r44 = r6
            int r6 = r4.getCount()     // Catch:{ all -> 0x037f }
            r10.<init>(r6)     // Catch:{ all -> 0x037f }
        L_0x02e6:
            boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0381
            long r20 = r4.getLong(r0)     // Catch:{ all -> 0x037f }
            long r22 = r4.getLong(r3)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r8)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x02fc
            r6 = 0
            goto L_0x0300
        L_0x02fc:
            java.lang.String r6 = r4.getString(r8)     // Catch:{ all -> 0x037f }
        L_0x0300:
            ne5[] r19 = defpackage.ne5.b     // Catch:{ all -> 0x037f }
            ne5 r24 = defpackage.np8.q(r6)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r9)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x030f
            r25 = 0
            goto L_0x0315
        L_0x030f:
            java.lang.String r6 = r4.getString(r9)     // Catch:{ all -> 0x037f }
            r25 = r6
        L_0x0315:
            boolean r6 = r4.isNull(r12)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x031e
            r26 = 0
            goto L_0x0324
        L_0x031e:
            java.lang.String r6 = r4.getString(r12)     // Catch:{ all -> 0x037f }
            r26 = r6
        L_0x0324:
            long r27 = r4.getLong(r13)     // Catch:{ all -> 0x037f }
            long r29 = r4.getLong(r5)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r14)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0335
            r31 = 0
            goto L_0x033b
        L_0x0335:
            java.lang.String r6 = r4.getString(r14)     // Catch:{ all -> 0x037f }
            r31 = r6
        L_0x033b:
            long r32 = r4.getLong(r2)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r1)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0348
            r34 = 0
            goto L_0x034e
        L_0x0348:
            java.lang.String r6 = r4.getString(r1)     // Catch:{ all -> 0x037f }
            r34 = r6
        L_0x034e:
            boolean r6 = r4.isNull(r15)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0357
            r35 = 0
            goto L_0x035d
        L_0x0357:
            java.lang.String r6 = r4.getString(r15)     // Catch:{ all -> 0x037f }
            r35 = r6
        L_0x035d:
            int r6 = r4.getInt(r7)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0366
            r36 = 1
            goto L_0x0368
        L_0x0366:
            r36 = 0
        L_0x0368:
            int r6 = r4.getInt(r11)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0371
            r37 = 1
            goto L_0x0373
        L_0x0371:
            r37 = 0
        L_0x0373:
            je5 r6 = new je5     // Catch:{ all -> 0x037f }
            r19 = r6
            r19.<init>(r20, r22, r24, r25, r26, r27, r29, r31, r32, r34, r35, r36, r37)     // Catch:{ all -> 0x037f }
            r10.add(r6)     // Catch:{ all -> 0x037f }
            goto L_0x02e6
        L_0x037f:
            r0 = move-exception
            goto L_0x038b
        L_0x0381:
            r4.close()
            r44.n()
            return r10
        L_0x0388:
            r0 = move-exception
            r44 = r6
        L_0x038b:
            r4.close()
            r44.n()
            throw r0
        L_0x0392:
            sx r12 = (defpackage.sx) r12
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.X
            r1 = 1
            r0.set(r1)
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x03aa }
            r12.a()     // Catch:{ all -> 0x03aa }
            android.os.Binder.flushPendingCommands()     // Catch:{ all -> 0x03aa }
            r1 = 0
            r12.b(r1)
            return r1
        L_0x03aa:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.o     // Catch:{ all -> 0x03b2 }
            r2 = 1
            r1.set(r2)     // Catch:{ all -> 0x03b2 }
            throw r0     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            r0 = move-exception
            r1 = 0
            r12.b(r1)
            throw r0
        L_0x03b8:
            oy8 r12 = (defpackage.oy8) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x03d0 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x03d0 }
            ky8 r0 = (defpackage.ky8) r0     // Catch:{ all -> 0x03d0 }
            r2.C(r0)     // Catch:{ all -> 0x03d0 }
            r1.r()     // Catch:{ all -> 0x03d0 }
            r1.l()
            r1 = 0
            return r1
        L_0x03d0:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x03d5:
            le5 r12 = (defpackage.le5) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            xlc r2 = (defpackage.xlc) r2
            r3 = 0
            android.database.Cursor r1 = r1.o(r2, r3)
            int r0 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x040d }
            java.lang.String r3 = "last_notify_msg_id"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x040d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x040d }
            int r5 = r1.getCount()     // Catch:{ all -> 0x040d }
            r4.<init>(r5)     // Catch:{ all -> 0x040d }
        L_0x03f6:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x040d }
            if (r5 == 0) goto L_0x040f
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x040d }
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x040d }
            me5 r9 = new me5     // Catch:{ all -> 0x040d }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x040d }
            r4.add(r9)     // Catch:{ all -> 0x040d }
            goto L_0x03f6
        L_0x040d:
            r0 = move-exception
            goto L_0x0416
        L_0x040f:
            r1.close()
            r2.n()
            return r4
        L_0x0416:
            r1.close()
            r2.n()
            throw r0
        L_0x041d:
            le5 r12 = (defpackage.le5) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0434 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0434 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0434 }
            r2.B(r0)     // Catch:{ all -> 0x0434 }
            r1.r()     // Catch:{ all -> 0x0434 }
            r1.l()
            return r9
        L_0x0434:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0439:
            ud5 r12 = (defpackage.ud5) r12
            ilc r3 = r12.a
            java.lang.Object r0 = r0.b
            r4 = r0
            xlc r4 = (defpackage.xlc) r4
            r6 = 0
            android.database.Cursor r3 = r3.o(r4, r6)
            int r0 = defpackage.tfg.n(r3, r2)     // Catch:{ all -> 0x054c }
            int r2 = defpackage.tfg.n(r3, r8)     // Catch:{ all -> 0x054c }
            java.lang.String r6 = "msg_id"
            int r6 = defpackage.tfg.n(r3, r6)     // Catch:{ all -> 0x054c }
            java.lang.String r7 = "analytics_status"
            int r7 = defpackage.tfg.n(r3, r7)     // Catch:{ all -> 0x054c }
            java.lang.String r8 = "suid"
            int r8 = defpackage.tfg.n(r3, r8)     // Catch:{ all -> 0x054c }
            java.lang.String r9 = "content_length"
            int r9 = defpackage.tfg.n(r3, r9)     // Catch:{ all -> 0x054c }
            java.lang.String r10 = "sent_time"
            int r10 = defpackage.tfg.n(r3, r10)     // Catch:{ all -> 0x054c }
            int r1 = defpackage.tfg.n(r3, r1)     // Catch:{ all -> 0x054c }
            java.lang.String r11 = "fcm_sent_time"
            int r11 = defpackage.tfg.n(r3, r11)     // Catch:{ all -> 0x054c }
            java.lang.String r12 = "received_time"
            int r12 = defpackage.tfg.n(r3, r12)     // Catch:{ all -> 0x054c }
            java.lang.String r13 = "push_type"
            int r13 = defpackage.tfg.n(r3, r13)     // Catch:{ all -> 0x054c }
            int r5 = defpackage.tfg.n(r3, r5)     // Catch:{ all -> 0x054c }
            java.lang.String r14 = "created_time"
            int r14 = defpackage.tfg.n(r3, r14)     // Catch:{ all -> 0x054c }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x054c }
            r44 = r4
            int r4 = r3.getCount()     // Catch:{ all -> 0x0543 }
            r15.<init>(r4)     // Catch:{ all -> 0x0543 }
        L_0x0498:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0543 }
            if (r4 == 0) goto L_0x0545
            long r20 = r3.getLong(r0)     // Catch:{ all -> 0x0543 }
            long r22 = r3.getLong(r2)     // Catch:{ all -> 0x0543 }
            long r24 = r3.getLong(r6)     // Catch:{ all -> 0x0543 }
            int r4 = r3.getInt(r7)     // Catch:{ all -> 0x0543 }
            r19 = 3
            r41 = r0
            int[] r0 = defpackage.au1.v(r19)     // Catch:{ all -> 0x0543 }
            r42 = r2
            int r2 = r0.length     // Catch:{ all -> 0x0543 }
            r43 = r6
            r6 = 0
        L_0x04bc:
            if (r6 >= r2) goto L_0x04d0
            r19 = r0[r6]     // Catch:{ all -> 0x0543 }
            r26 = r0
            int r0 = defpackage.au1.s(r19)     // Catch:{ all -> 0x0543 }
            if (r0 != r4) goto L_0x04c9
            goto L_0x04d2
        L_0x04c9:
            r18 = 1
            int r6 = r6 + 1
            r0 = r26
            goto L_0x04bc
        L_0x04d0:
            r19 = 0
        L_0x04d2:
            if (r19 != 0) goto L_0x04d7
            r26 = 1
            goto L_0x04d9
        L_0x04d7:
            r26 = r19
        L_0x04d9:
            boolean r0 = r3.isNull(r8)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x04e2
            r27 = 0
            goto L_0x04ec
        L_0x04e2:
            long r27 = r3.getLong(r8)     // Catch:{ all -> 0x0543 }
            java.lang.Long r0 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0543 }
            r27 = r0
        L_0x04ec:
            long r28 = r3.getLong(r9)     // Catch:{ all -> 0x0543 }
            boolean r0 = r3.isNull(r10)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x04f9
            r30 = 0
            goto L_0x0503
        L_0x04f9:
            long r30 = r3.getLong(r10)     // Catch:{ all -> 0x0543 }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0543 }
            r30 = r0
        L_0x0503:
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x050c
            r31 = 0
            goto L_0x0512
        L_0x050c:
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x0543 }
            r31 = r0
        L_0x0512:
            long r32 = r3.getLong(r11)     // Catch:{ all -> 0x0543 }
            long r34 = r3.getLong(r12)     // Catch:{ all -> 0x0543 }
            boolean r0 = r3.isNull(r13)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x0523
            r36 = 0
            goto L_0x0529
        L_0x0523:
            java.lang.String r0 = r3.getString(r13)     // Catch:{ all -> 0x0543 }
            r36 = r0
        L_0x0529:
            long r37 = r3.getLong(r5)     // Catch:{ all -> 0x0543 }
            long r39 = r3.getLong(r14)     // Catch:{ all -> 0x0543 }
            vd5 r0 = new vd5     // Catch:{ all -> 0x0543 }
            r19 = r0
            r19.<init>(r20, r22, r24, r26, r27, r28, r30, r31, r32, r34, r36, r37, r39)     // Catch:{ all -> 0x0543 }
            r15.add(r0)     // Catch:{ all -> 0x0543 }
            r0 = r41
            r2 = r42
            r6 = r43
            goto L_0x0498
        L_0x0543:
            r0 = move-exception
            goto L_0x054f
        L_0x0545:
            r3.close()
            r44.n()
            return r15
        L_0x054c:
            r0 = move-exception
            r44 = r4
        L_0x054f:
            r3.close()
            r44.n()
            throw r0
        L_0x0556:
            ud5 r12 = (defpackage.ud5) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x056d }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x056d }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x056d }
            r2.B(r0)     // Catch:{ all -> 0x056d }
            r1.r()     // Catch:{ all -> 0x056d }
            r1.l()
            return r9
        L_0x056d:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0572:
            od5 r12 = (defpackage.od5) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            xlc r0 = (defpackage.xlc) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05a3 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x05a3 }
            r0.<init>(r2)     // Catch:{ all -> 0x05a3 }
        L_0x0588:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x05a3 }
            if (r2 == 0) goto L_0x05a5
            r2 = 0
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x05a3 }
            if (r3 == 0) goto L_0x0597
            r2 = 0
            goto L_0x059f
        L_0x0597:
            long r3 = r1.getLong(r2)     // Catch:{ all -> 0x05a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05a3 }
        L_0x059f:
            r0.add(r2)     // Catch:{ all -> 0x05a3 }
            goto L_0x0588
        L_0x05a3:
            r0 = move-exception
            goto L_0x05a9
        L_0x05a5:
            r1.close()
            return r0
        L_0x05a9:
            r1.close()
            throw r0
        L_0x05ad:
            fd5 r12 = (defpackage.fd5) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            xlc r0 = (defpackage.xlc) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05de }
            int r2 = r1.getCount()     // Catch:{ all -> 0x05de }
            r0.<init>(r2)     // Catch:{ all -> 0x05de }
        L_0x05c3:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x05de }
            if (r2 == 0) goto L_0x05e0
            r2 = 0
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x05de }
            if (r3 == 0) goto L_0x05d2
            r3 = 0
            goto L_0x05da
        L_0x05d2:
            long r3 = r1.getLong(r2)     // Catch:{ all -> 0x05de }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05de }
        L_0x05da:
            r0.add(r3)     // Catch:{ all -> 0x05de }
            goto L_0x05c3
        L_0x05de:
            r0 = move-exception
            goto L_0x05e4
        L_0x05e0:
            r1.close()
            return r0
        L_0x05e4:
            r1.close()
            throw r0
        L_0x05e8:
            tp4 r12 = (defpackage.tp4) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0600 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0600 }
            np4 r0 = (defpackage.np4) r0     // Catch:{ all -> 0x0600 }
            r2.C(r0)     // Catch:{ all -> 0x0600 }
            r1.r()     // Catch:{ all -> 0x0600 }
            r1.l()
            r1 = 0
            return r1
        L_0x0600:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0605:
            ed1 r12 = (defpackage.ed1) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            xlc r0 = (defpackage.xlc) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "conversation_id"
            int r0 = defpackage.tfg.n(r1, r0)     // Catch:{ all -> 0x065e }
            java.lang.String r2 = "join_link"
            int r2 = defpackage.tfg.n(r1, r2)     // Catch:{ all -> 0x065e }
            java.lang.String r3 = "started_at"
            int r3 = defpackage.tfg.n(r1, r3)     // Catch:{ all -> 0x065e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x065e }
            int r5 = r1.getCount()     // Catch:{ all -> 0x065e }
            r4.<init>(r5)     // Catch:{ all -> 0x065e }
        L_0x062d:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x065e }
            if (r5 == 0) goto L_0x0660
            boolean r5 = r1.isNull(r0)     // Catch:{ all -> 0x065e }
            if (r5 == 0) goto L_0x063b
            r5 = 0
            goto L_0x063f
        L_0x063b:
            java.lang.String r5 = r1.getString(r0)     // Catch:{ all -> 0x065e }
        L_0x063f:
            boolean r6 = r1.isNull(r2)     // Catch:{ all -> 0x065e }
            if (r6 == 0) goto L_0x0647
            r6 = 0
            goto L_0x064b
        L_0x0647:
            java.lang.String r6 = r1.getString(r2)     // Catch:{ all -> 0x065e }
        L_0x064b:
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x065e }
            ec1 r9 = new ec1     // Catch:{ all -> 0x065e }
            r9.<init>()     // Catch:{ all -> 0x065e }
            r9.a = r5     // Catch:{ all -> 0x065e }
            r9.b = r6     // Catch:{ all -> 0x065e }
            r9.c = r7     // Catch:{ all -> 0x065e }
            r4.add(r9)     // Catch:{ all -> 0x065e }
            goto L_0x062d
        L_0x065e:
            r0 = move-exception
            goto L_0x0664
        L_0x0660:
            r1.close()
            return r4
        L_0x0664:
            r1.close()
            throw r0
        L_0x0668:
            ed1 r12 = (defpackage.ed1) r12
            th r1 = r12.b
            ilc r2 = r12.a
            q36 r3 = r1.f()
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x067d
            r4 = 1
            r3.W(r4)
            goto L_0x0681
        L_0x067d:
            r4 = 1
            r3.f(r4, r0)
        L_0x0681:
            r2.c()     // Catch:{ all -> 0x0697 }
            r3.n()     // Catch:{ all -> 0x0692 }
            r2.r()     // Catch:{ all -> 0x0692 }
            r2.l()     // Catch:{ all -> 0x0697 }
            r1.t(r3)
            r1 = 0
            return r1
        L_0x0692:
            r0 = move-exception
            r2.l()     // Catch:{ all -> 0x0697 }
            throw r0     // Catch:{ all -> 0x0697 }
        L_0x0697:
            r0 = move-exception
            r1.t(r3)
            throw r0
        L_0x069c:
            oj r12 = (defpackage.oj) r12
            ilc r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            xlc r2 = (defpackage.xlc) r2
            r3 = 0
            android.database.Cursor r1 = r1.o(r2, r3)
            int r0 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x0724 }
            java.lang.String r5 = "name"
            int r5 = defpackage.tfg.n(r1, r5)     // Catch:{ all -> 0x0724 }
            java.lang.String r6 = "icon_url"
            int r6 = defpackage.tfg.n(r1, r6)     // Catch:{ all -> 0x0724 }
            java.lang.String r7 = "icon_lottie_url"
            int r7 = defpackage.tfg.n(r1, r7)     // Catch:{ all -> 0x0724 }
            int r4 = defpackage.tfg.n(r1, r4)     // Catch:{ all -> 0x0724 }
            java.lang.String r8 = "animoji_ids"
            int r8 = defpackage.tfg.n(r1, r8)     // Catch:{ all -> 0x0724 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0724 }
            int r10 = r1.getCount()     // Catch:{ all -> 0x0724 }
            r9.<init>(r10)     // Catch:{ all -> 0x0724 }
        L_0x06d3:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0726
            long r12 = r1.getLong(r0)     // Catch:{ all -> 0x0724 }
            boolean r10 = r1.isNull(r5)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x06e5
            r14 = r3
            goto L_0x06ea
        L_0x06e5:
            java.lang.String r10 = r1.getString(r5)     // Catch:{ all -> 0x0724 }
            r14 = r10
        L_0x06ea:
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x06f2
            r15 = r3
            goto L_0x06f7
        L_0x06f2:
            java.lang.String r10 = r1.getString(r6)     // Catch:{ all -> 0x0724 }
            r15 = r10
        L_0x06f7:
            boolean r10 = r1.isNull(r7)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0700
            r16 = r3
            goto L_0x0706
        L_0x0700:
            java.lang.String r10 = r1.getString(r7)     // Catch:{ all -> 0x0724 }
            r16 = r10
        L_0x0706:
            long r17 = r1.getLong(r4)     // Catch:{ all -> 0x0724 }
            boolean r10 = r1.isNull(r8)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0712
            r10 = r3
            goto L_0x0716
        L_0x0712:
            java.lang.String r10 = r1.getString(r8)     // Catch:{ all -> 0x0724 }
        L_0x0716:
            java.util.ArrayList r19 = defpackage.ngg.I(r10)     // Catch:{ all -> 0x0724 }
            nj r10 = new nj     // Catch:{ all -> 0x0724 }
            r11 = r10
            r11.<init>(r12, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0724 }
            r9.add(r10)     // Catch:{ all -> 0x0724 }
            goto L_0x06d3
        L_0x0724:
            r0 = move-exception
            goto L_0x072d
        L_0x0726:
            r1.close()
            r2.n()
            return r9
        L_0x072d:
            r1.close()
            r2.n()
            throw r0
        L_0x0734:
            oj r12 = (defpackage.oj) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x074b }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x074b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x074b }
            r2.B(r0)     // Catch:{ all -> 0x074b }
            r1.r()     // Catch:{ all -> 0x074b }
            r1.l()
            return r9
        L_0x074b:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0750:
            wh r12 = (defpackage.wh) r12
            ilc r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0767 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0767 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0767 }
            r2.B(r0)     // Catch:{ all -> 0x0767 }
            r1.r()     // Catch:{ all -> 0x0767 }
            r1.l()
            return r9
        L_0x0767:
            r0 = move-exception
            r1.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh.call():java.lang.Object");
    }

    public void finalize() {
        switch (this.a) {
            case 4:
                ((xlc) this.b).n();
                return;
            case 6:
                ((xlc) this.b).n();
                return;
            case 7:
                ((xlc) this.b).n();
                return;
            case 19:
                ((xlc) this.b).n();
                return;
            case 25:
                ((xlc) this.b).n();
                return;
            case 27:
                ((xlc) this.b).n();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public uh(sx sxVar) {
        this.a = 13;
        this.c = sxVar;
    }
}
