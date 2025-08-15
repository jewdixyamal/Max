package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.net.Uri;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executors;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.http.NoHttpApiEndpointException;

/* renamed from: rq9  reason: default package */
public final class rq9 implements o5b, nr2, qj3, s43, q7f, i43, dn6, Provider, vp6, df9 {
    public static final v83 X;
    public static final hxe Y = new hxe(new exe(new fxe(-1, 352321535, -9810433, -14672348), new gxe(1728053247, 184549375, -1721086465)), new ixe(new jxe(-15921907, 352321535, -855638017, -11513776, 1895825407, -8618884, -9810433), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548109383, -1548109383, -1548109383, -1548109383, -1721086465)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -9810433), new qxe(-1559425779, 2063597567, -1548109383, -1548109383, -1721086465)));
    public static final i9g Z = new i9g(new h9g(-15198184, -14672348, 401074151, -14672348), new j9g(-855638017, 1895825407, -8618884, -9810433, 1895825407), new k9g(266856423, 15198183, -9810433), new l9g(-1579033, -9810433, 1474815975, -1, -1108875289, -2130706433, -2130706433, -9810433));
    public static rq9 a;
    public static final rq9 b = new Object();
    public static final is0 c;
    public static final is0 o;
    public static final rq9 s0 = new Object();
    public static final rq9 t0 = new Object();
    public static final rq9 u0 = new Object();
    public static rq9 v0;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, rq9] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, rq9] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, rq9] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, rq9] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1301656065, -1721086465, 1718242815);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(697119692, 9253836), new es0(1032664012, 9253836), new fs0(1384985548, 9253836));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-9810433, 704643071, -9810433, 704643071);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -3158065, -2133864497, 536870911, -13028803, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-13487043, -13487043, -13487043}, new int[]{-13487043, -13487043});
        c = new is0(bs0, new js0(-13028803, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14078413, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -8362241, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
        as0 as03 = r1;
        as0 as04 = new as0(-1721086465, -1721086465, 1718242815);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(704643071, 16777215), new es0(1032664012, 9253836), new fs0(1384985548, 9253836));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-1, 704643071, -9810433, 704643071);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -520093697, -2130706433, 704643071, -7523380, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-1741997, -7523380, -13022491}, new int[]{-13022491, -7523380});
        o = new is0(bs03, new js0(-10469159, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-10469159, 452984831, -2046820353, -1), new ls0(new ms0(-9810433, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
        j73 j73 = new j73(new i73(-48049, -1579033, -9810433, -5058310), new k73(-1, 1895825407, -9810433));
        l73 l73 = r9;
        l73 l732 = new l73(0, 0, 0, 0, 0, 0, -15725039, -15725039, 1032871917, -11319257, -11319257, 5457959, -14465714, -14465714, 2311502);
        n73 n73 = r31;
        n73 n732 = new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -7523380, 724959367, 1305464783, -1, -10669092, 721429580, 1305464783, -1);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1556990915, -533580739, -533580739}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831);
        X = new v83(j73, new m73(l73, n73, q73, v73, -9810433, 1932407608, -1305266074, -869058458, -13420442, -15263716, -1, 536870911, 402653183, -9810433, -1559491570, -871625714, -1727263730, 1301964543, -9810433, -12171706, -15725039, new int[]{-1305266074, -1305266074}, new int[]{-13420442, -13420442}, new int[]{-650954650, -1305266074, -1942800282}, new int[]{-15725039, -15725039}), new w83(-9810433, -520093697, -3259817, -2130706433, -9810433, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-12641537), 536870911), new i93(-1721086465, 184549375, 1728053247)), new k93(new l93(1207959551, -1721086465)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1721086465))), new o93(new p93(536870911), -855638017, 1882734149), new q93(-855638017, -855638017, -15987698, -3259817, -520093697, 1895825407, 1207959551, -9810433));
    }

    public static final void e(File... fileArr) {
        for (File file : fileArr) {
            if (file.exists()) {
                try {
                    m6d.k(file);
                } catch (IOException unused) {
                    file.toString();
                }
            }
        }
    }

    public static final hs i(File... fileArr) {
        hs hsVar = new hs();
        int i = 0;
        for (File file : fileArr) {
            boolean exists = file.exists();
            List list = nz4.a;
            if (exists) {
                try {
                    ByteBuffer wrap = ByteBuffer.wrap(lk5.G(file));
                    kl7 l = j1e.l();
                    while (wrap.hasRemaining()) {
                        try {
                            if (wrap.hasArray()) {
                                long j = wrap.getLong();
                                int i2 = wrap.getInt();
                                if (wrap.remaining() >= i2) {
                                    int position = wrap.position() + wrap.arrayOffset();
                                    ns7 ns7 = new ns7(j, ys.Z(position, wrap.array(), position + i2));
                                    wrap.position(wrap.position() + i2);
                                    l.add(ns7);
                                } else {
                                    throw new BufferUnderflowException();
                                }
                            } else {
                                throw new IllegalArgumentException("Only buffers with backing array supported".toString());
                            }
                        } catch (BufferUnderflowException unused) {
                        }
                    }
                    if (l.getSize() > 1) {
                        c63.U(l, new ky6(4));
                    }
                    list = j1e.d(l);
                } catch (Exception unused2) {
                    file.toString();
                }
            }
            if (!list.isEmpty()) {
                if (!hsVar.isEmpty()) {
                    if (!hsVar.isEmpty()) {
                        if (((ns7) hsVar.b[hsVar.h(y53.L(hsVar) + hsVar.a)]).a >= ((ns7) x53.g0(list)).a) {
                            int i3 = hsVar.c;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    break;
                                } else if (((ns7) hsVar.get(i4)).a > ((ns7) x53.p0(list)).a) {
                                    hsVar.addAll(i4, list);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    } else {
                        throw new NoSuchElementException("ArrayDeque is empty.");
                    }
                }
                hsVar.addAll(list);
            }
        }
        Iterator it = hsVar.iterator();
        while (it.hasNext()) {
            i += ((ns7) it.next()).c;
        }
        while (i > 65536) {
            i -= ((ns7) hsVar.j()).c;
        }
        return hsVar;
    }

    public static final kl7 j(DataInputStream dataInputStream) {
        Object obj;
        kl7 l = j1e.l();
        while (dataInputStream.read() == 3) {
            long readLong = dataInputStream.readLong();
            String readUTF = dataInputStream.readUTF();
            long readLong2 = dataInputStream.readLong();
            String readUTF2 = dataInputStream.readUTF();
            ky7 ky7 = new ky7();
            int readInt = dataInputStream.readInt();
            for (int i = 0; i < readInt; i++) {
                String readUTF3 = dataInputStream.readUTF();
                int readInt2 = dataInputStream.readInt();
                if (readInt2 == 1) {
                    obj = dataInputStream.readUTF();
                } else if (readInt2 == 2) {
                    obj = Boolean.valueOf(dataInputStream.readBoolean());
                } else if (readInt2 == 3) {
                    obj = Long.valueOf(dataInputStream.readLong());
                } else if (readInt2 == 4) {
                    obj = Double.valueOf(dataInputStream.readDouble());
                } else {
                    throw new IOException(zr6.h(readInt2, "Unsupported attribute value type "));
                }
                ky7.put(readUTF3, obj);
            }
            l.add(new ata(readLong, readUTF, readLong2, readUTF2, ky7.b()));
        }
        return j1e.d(l);
    }

    public static final void l(DataOutputStream dataOutputStream, ata ata) {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeLong(ata.a);
        dataOutputStream.writeUTF(ata.b);
        dataOutputStream.writeLong(ata.c);
        dataOutputStream.writeUTF(ata.d);
        Map map = ata.e;
        dataOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            dataOutputStream.writeUTF((String) entry.getKey());
            if (value instanceof Boolean) {
                dataOutputStream.writeInt(2);
                dataOutputStream.writeBoolean(((Boolean) value).booleanValue());
            } else {
                if (value instanceof Long ? true : value instanceof Integer ? true : value instanceof Byte ? true : value instanceof Short) {
                    dataOutputStream.writeInt(3);
                    dataOutputStream.writeLong(((Number) value).longValue());
                } else {
                    if (value instanceof Double ? true : value instanceof Float) {
                        dataOutputStream.writeInt(4);
                        dataOutputStream.writeDouble(((Number) value).doubleValue());
                    } else {
                        dataOutputStream.writeInt(1);
                        dataOutputStream.writeUTF(value.toString());
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.Object, rq9] */
    public static rq9 n(Context context, int i) {
        c54.j("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, z2c.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(z2c.MaterialCalendarItem_android_insetBottom, 0));
        ju0.q(context, obtainStyledAttributes, z2c.MaterialCalendarItem_itemFillColor);
        ju0.q(context, obtainStyledAttributes, z2c.MaterialCalendarItem_itemTextColor);
        ju0.q(context, obtainStyledAttributes, z2c.MaterialCalendarItem_itemStrokeColor);
        obtainStyledAttributes.getDimensionPixelSize(z2c.MaterialCalendarItem_itemStrokeWidth, 0);
        gjd.a(context, obtainStyledAttributes.getResourceId(z2c.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(z2c.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new a0((float) 0)).c();
        obtainStyledAttributes.recycle();
        ? obj = new Object();
        c54.m(rect.left);
        c54.m(rect.top);
        c54.m(rect.right);
        c54.m(rect.bottom);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, rq9] */
    public static synchronized rq9 o() {
        rq9 rq9;
        synchronized (rq9.class) {
            try {
                if (a == null) {
                    a = new Object();
                }
                rq9 = a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return rq9;
    }

    public static boolean q(List list, String str, String str2, int i) {
        if (str2 != null) {
            String Y0 = w9e.Y0(31, str);
            int length = Y0.length();
            String Y02 = w9e.Y0(31, str2);
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str3 = (String) it.next();
                if (eae.o0(str3, Y0, false) && str3.length() > length && str3.charAt(length) == '=') {
                    it.remove();
                    if (str3.endsWith(Y02) && str3.length() == Y02.length() + length + 1) {
                        list.add(str3);
                        return false;
                    }
                }
            }
            list.add(Y0 + '=' + Y02);
            while (list.size() > i) {
                list.remove(0);
            }
        } else {
            String Y03 = w9e.Y0(31, str);
            int length2 = Y03.length();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str4 = (String) it2.next();
                if (eae.o0(str4, Y03, false) && str4.length() > length2 && str4.charAt(length2) == '=') {
                    it2.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        defpackage.v3c.i(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008f, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.sh0 t() {
        /*
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = "https"
            android.net.Uri$Builder r0 = r0.scheme(r1)
            java.lang.String r1 = "dns.google.com"
            android.net.Uri$Builder r0 = r0.authority(r1)
            java.lang.String r1 = "resolve"
            android.net.Uri$Builder r0 = r0.appendPath(r1)
            java.lang.String r1 = "name"
            java.lang.String r2 = "api._endpoint.ok.ru."
            r0.appendQueryParameter(r1, r2)
            r2 = 16
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = "type"
            r0.appendQueryParameter(r3, r2)
            java.lang.String r0 = r0.toString()
            java.net.URL r2 = new java.net.URL
            r2.<init>(r0)
            java.net.URLConnection r0 = r2.openConnection()
            r2 = 3000(0xbb8, float:4.204E-42)
            r0.setConnectTimeout(r2)
            r0.setReadTimeout(r2)
            java.io.InputStream r0 = r0.getInputStream()
            java.nio.charset.Charset r2 = defpackage.a52.a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            r4.<init>(r0, r2)
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r2)
            java.lang.String r2 = defpackage.m6d.H(r0)     // Catch:{ all -> 0x0089 }
            r4 = 0
            defpackage.v3c.i(r0, r4)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0082 }
            r0.<init>((java.lang.String) r2)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "Answer"
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ JSONException -> 0x0082 }
            r2 = 0
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch:{ JSONException -> 0x0082 }
            r0.getString(r1)     // Catch:{ JSONException -> 0x0082 }
            r0.getInt(r3)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r1 = "TTL"
            int r1 = r0.getInt(r1)     // Catch:{ JSONException -> 0x0082 }
            java.lang.String r2 = "data"
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0082 }
            sh0 r2 = new sh0     // Catch:{ JSONException -> 0x0082 }
            r3 = 8
            r2.<init>((int) r1, (java.io.Serializable) r0, (int) r3)     // Catch:{ JSONException -> 0x0082 }
            return r2
        L_0x0082:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0089:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008b }
        L_0x008b:
            r2 = move-exception
            defpackage.v3c.i(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq9.t():sh0");
    }

    public ypa E(xm6 xm6, pm6 pm6) {
        return new bn6(xm6, pm6);
    }

    public void a() {
    }

    public void accept(Object obj) {
        hm9.p(mp4.g, "restoreUploadsFromStorage: failed", (Throwable) obj);
    }

    public void b(String str) {
    }

    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83 = X;
        j73 j73 = v83.a;
        if (i == i2) {
            return j73.a.a;
        }
        if (i == lsb.chat_common_action_background_neutral) {
            return j73.a.b;
        }
        if (i == lsb.chat_common_action_background_themed) {
            return j73.a.c;
        }
        if (i == lsb.chat_common_action_background_themedFade) {
            return j73.a.d;
        }
        if (i == lsb.chat_common_action_icon_contrastStatic) {
            j73.b.getClass();
        } else if (i == lsb.chat_common_action_icon_neutral) {
            return j73.b.a;
        } else {
            if (i == lsb.chat_common_action_icon_neutralSecondary) {
                return j73.b.b;
            }
            if (i == lsb.chat_common_action_icon_themedFade) {
                return j73.b.c;
            }
            int i3 = lsb.chat_common_background_accent;
            m73 m73 = v83.b;
            if (i == i3) {
                return m73.e;
            }
            if (i == lsb.chat_common_background_capsule) {
                return m73.f;
            }
            if (i == lsb.chat_common_background_capsuleOutside) {
                return m73.g;
            }
            if (i == lsb.chat_common_background_capsuleSecondary) {
                return m73.h;
            }
            if (i == lsb.chat_common_background_chatFAB) {
                return m73.i;
            }
            if (i == lsb.chat_common_background_contrastFloatingSecondary) {
                return m73.j;
            }
            if (i == lsb.chat_common_background_contrastStatic) {
                m73.getClass();
            } else if (i == lsb.chat_common_background_neutral) {
                return m73.k;
            } else {
                if (i == lsb.chat_common_background_neutralFade) {
                    m73.getClass();
                    return 1543503872;
                } else if (i == lsb.chat_common_background_neutralFadeSecondary) {
                    return m73.l;
                } else {
                    if (i == lsb.chat_common_background_neutralFadeTertiary) {
                        return m73.m;
                    }
                    if (i == lsb.chat_common_background_neutralThemed) {
                        return m73.n;
                    }
                    if (i == lsb.chat_common_background_overlay) {
                        return m73.o;
                    }
                    if (i == lsb.chat_common_background_overlayHard) {
                        return m73.p;
                    }
                    if (i == lsb.chat_common_background_overlaySecondary) {
                        return m73.q;
                    }
                    if (i == lsb.chat_common_background_pattern) {
                        return m73.r;
                    }
                    if (i == lsb.chat_common_background_searchHighlight) {
                        return m73.s;
                    }
                    if (i == lsb.chat_common_background_stickerBlank) {
                        return m73.t;
                    }
                    if (i == lsb.chat_common_background_surfaceGround) {
                        return m73.u;
                    }
                    if (i == lsb.chat_common_background_timelineActive) {
                        m73.getClass();
                        return -1191182337;
                    } else if (i == lsb.chat_common_background_timelinePassive) {
                        m73.getClass();
                        return 1392508927;
                    } else if (i == lsb.chat_common_background_chatBackground_additionalStep1) {
                        return m73.a.a;
                    } else {
                        if (i == lsb.chat_common_background_chatBackground_additionalStep2) {
                            return m73.a.b;
                        }
                        if (i == lsb.chat_common_background_chatBackground_additionalStep3) {
                            return m73.a.c;
                        }
                        if (i == lsb.chat_common_background_chatBackground_additionalStep4) {
                            return m73.a.d;
                        }
                        if (i == lsb.chat_common_background_chatBackground_additionalStep5) {
                            return m73.a.e;
                        }
                        if (i == lsb.chat_common_background_chatBackground_additionalStep6) {
                            return m73.a.f;
                        }
                        if (i == lsb.chat_common_background_chatBackground_backgroundStep1) {
                            return m73.a.g;
                        }
                        if (i == lsb.chat_common_background_chatBackground_backgroundStep2) {
                            return m73.a.h;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternColor) {
                            return m73.a.i;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep1) {
                            return m73.a.j;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep2) {
                            return m73.a.k;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep3) {
                            return m73.a.l;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep4) {
                            return m73.a.m;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep5) {
                            return m73.a.n;
                        }
                        if (i == lsb.chat_common_background_chatBackground_patternStep6) {
                            return m73.a.o;
                        }
                        if (i == lsb.chat_common_background_fileType_archiveBadge) {
                            return m73.b.a;
                        }
                        if (i == lsb.chat_common_background_fileType_archiveBkg) {
                            return m73.b.b;
                        }
                        if (i == lsb.chat_common_background_fileType_archiveElement) {
                            return m73.b.c;
                        }
                        if (i == lsb.chat_common_background_fileType_archiveIcon) {
                            return m73.b.d;
                        }
                        if (i == lsb.chat_common_background_fileType_background) {
                            return m73.b.e;
                        }
                        if (i == lsb.chat_common_background_fileType_dataBadge) {
                            m73.b.getClass();
                            return -15697601;
                        } else if (i == lsb.chat_common_background_fileType_dataBkg) {
                            return m73.b.f;
                        } else {
                            if (i == lsb.chat_common_background_fileType_dataElement) {
                                return m73.b.g;
                            }
                            if (i == lsb.chat_common_background_fileType_dataIcon) {
                                return m73.b.h;
                            }
                            if (i == lsb.chat_common_background_fileType_imageBadge) {
                                return m73.b.i;
                            }
                            if (i == lsb.chat_common_background_fileType_imageBkg) {
                                return m73.b.j;
                            }
                            if (i == lsb.chat_common_background_fileType_imageElement) {
                                return m73.b.k;
                            }
                            if (i == lsb.chat_common_background_fileType_imageIcon) {
                                return m73.b.l;
                            }
                            if (i == lsb.chat_common_background_fileType_musicBadge) {
                                return m73.b.m;
                            }
                            if (i == lsb.chat_common_background_fileType_musicBkg) {
                                return m73.b.n;
                            }
                            if (i == lsb.chat_common_background_fileType_musicElement) {
                                return m73.b.o;
                            }
                            if (i == lsb.chat_common_background_fileType_musicIcon) {
                                return m73.b.p;
                            }
                            if (i == lsb.chat_common_background_fileType_presentationBadge) {
                                m73.b.getClass();
                                return -6543440;
                            } else if (i == lsb.chat_common_background_fileType_presentationBkg) {
                                return m73.b.q;
                            } else {
                                if (i == lsb.chat_common_background_fileType_presentationElement) {
                                    return m73.b.r;
                                }
                                if (i == lsb.chat_common_background_fileType_presentationIcon) {
                                    return m73.b.s;
                                }
                                if (i == lsb.chat_common_background_fileType_programBadge) {
                                    return m73.b.t;
                                }
                                if (i == lsb.chat_common_background_fileType_programBkg) {
                                    return m73.b.u;
                                }
                                if (i == lsb.chat_common_background_fileType_programElement) {
                                    return m73.b.v;
                                }
                                if (i == lsb.chat_common_background_fileType_programIcon) {
                                    return m73.b.w;
                                }
                                if (i == lsb.chat_common_background_fileType_textBadge) {
                                    m73.b.getClass();
                                    return -14983490;
                                } else if (i == lsb.chat_common_background_fileType_textBkg) {
                                    return m73.b.x;
                                } else {
                                    if (i == lsb.chat_common_background_fileType_textElement) {
                                        return m73.b.y;
                                    }
                                    if (i == lsb.chat_common_background_fileType_textIcon) {
                                        return m73.b.z;
                                    }
                                    if (i == lsb.chat_common_background_fileType_unknownBadge) {
                                        return m73.b.A;
                                    }
                                    if (i == lsb.chat_common_background_fileType_unknownBkg) {
                                        return m73.b.B;
                                    }
                                    if (i == lsb.chat_common_background_fileType_unknownElement) {
                                        return m73.b.C;
                                    }
                                    if (i == lsb.chat_common_background_fileType_unknownIcon) {
                                        return m73.b.D;
                                    }
                                    if (i == lsb.chat_common_background_fileType_videoBadge) {
                                        return m73.b.E;
                                    }
                                    if (i == lsb.chat_common_background_fileType_videoBkg) {
                                        return m73.b.F;
                                    }
                                    if (i == lsb.chat_common_background_fileType_videoElement) {
                                        return m73.b.G;
                                    }
                                    if (i == lsb.chat_common_background_fileType_videoIcon) {
                                        return m73.b.H;
                                    }
                                    if (i == lsb.chat_common_background_skeleton_bubbleGradientPrimary_staticBackground) {
                                        return m73.c.a.b;
                                    }
                                    if (i == lsb.chat_common_background_skeleton_bubbleGradientSecondary_staticBackground) {
                                        return m73.c.b.b;
                                    }
                                    if (i == lsb.chat_common_background_skeleton_stickerPrimary_baseGradient_staticBackground) {
                                        return m73.c.c.a.b;
                                    }
                                    if (i == lsb.chat_common_background_skeleton_stickerSecondary_baseGradient_staticBackground) {
                                        return m73.c.d.a.b;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_qRBackground) {
                                        return m73.d.b;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_qRStep1) {
                                        return m73.d.c;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_qRStep2) {
                                        return m73.d.d;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_qRStep3) {
                                        return m73.d.e;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_qRStep4) {
                                        return m73.d.f;
                                    }
                                    if (i == lsb.chat_common_background_systemBubbleGradient_strokeFadeStep1) {
                                        m73.d.getClass();
                                        return 872415231;
                                    } else if (i == lsb.chat_common_background_systemBubbleGradient_strokeFadeStep2) {
                                        m73.d.getClass();
                                        return 452984831;
                                    } else if (i == lsb.chat_common_background_systemBubbleGradient_strokeStep1) {
                                        return m73.d.g;
                                    } else {
                                        if (i == lsb.chat_common_background_systemBubbleGradient_strokeStep2) {
                                            return m73.d.h;
                                        }
                                        int i4 = lsb.chat_common_icon_accent;
                                        w83 w83 = v83.c;
                                        if (i == i4) {
                                            return w83.a;
                                        }
                                        if (i == lsb.chat_common_icon_accentContrast) {
                                            return w83.b;
                                        }
                                        if (i == lsb.chat_common_icon_capsule) {
                                            w83.getClass();
                                        } else if (i == lsb.chat_common_icon_contrastStatic) {
                                            w83.getClass();
                                        } else if (i == lsb.chat_common_icon_negative) {
                                            return w83.c;
                                        } else {
                                            if (i == lsb.chat_common_icon_secondary) {
                                                return w83.d;
                                            }
                                            if (i == lsb.chat_common_icon_themed) {
                                                return w83.e;
                                            }
                                            if (i == lsb.chat_common_icon_verificationCapsule) {
                                                return w83.f;
                                            }
                                            int i5 = lsb.chat_common_shadows_elevation2_primary;
                                            b93 b93 = v83.d;
                                            if (i == i5) {
                                                return b93.a.a;
                                            }
                                            if (i == lsb.chat_common_shadows_elevation2_secondary) {
                                                return b93.a.b;
                                            }
                                            if (i == lsb.chat_common_shadows_topBar_color) {
                                                return b93.b.a;
                                            }
                                            if (i == lsb.chat_common_shadows_writeBar_color) {
                                                return b93.c.a;
                                            }
                                            int i6 = lsb.chat_common_states_background_active_neutralFadeTertiary;
                                            j93 j93 = v83.e;
                                            if (i == i6) {
                                                return j93.a.a.b;
                                            }
                                            if (i == lsb.chat_common_states_background_active_action_themed) {
                                                return j93.a.a.a.a;
                                            }
                                            if (i == lsb.chat_common_states_background_disabled_accent) {
                                                return j93.a.b.a;
                                            }
                                            if (i == lsb.chat_common_states_background_disabled_neutralFadeSecondary) {
                                                return j93.a.b.b;
                                            }
                                            if (i == lsb.chat_common_states_background_disabled_neutralThemed) {
                                                return j93.a.b.c;
                                            }
                                            if (i == lsb.chat_common_states_icon_disabled_negative) {
                                                return j93.b.a.a;
                                            }
                                            if (i == lsb.chat_common_states_icon_disabled_themed) {
                                                return j93.b.a.b;
                                            }
                                            if (i == lsb.chat_common_states_text_disabled_contrast) {
                                                return j93.c.a.a;
                                            }
                                            if (i == lsb.chat_common_states_text_disabled_contrastStatic) {
                                                return j93.c.a.b;
                                            }
                                            if (i == lsb.chat_common_states_text_disabled_negative) {
                                                return j93.c.a.c;
                                            }
                                            if (i == lsb.chat_common_states_text_disabled_primary) {
                                                return j93.c.a.d;
                                            }
                                            if (i == lsb.chat_common_states_text_disabled_themed) {
                                                return j93.c.a.e;
                                            }
                                            int i7 = lsb.chat_common_stroke_contrast;
                                            o93 o93 = v83.f;
                                            if (i == i7) {
                                                return o93.b;
                                            }
                                            if (i == lsb.chat_common_stroke_contrastStatic) {
                                                o93.getClass();
                                            } else if (i == lsb.chat_common_stroke_glass) {
                                                return o93.c;
                                            } else {
                                                if (i == lsb.chat_common_stroke_separator_primary) {
                                                    return o93.a.a;
                                                }
                                                int i8 = lsb.chat_common_text_capsule;
                                                q93 q93 = v83.g;
                                                if (i == i8) {
                                                    return q93.a;
                                                }
                                                if (i == lsb.chat_common_text_capsuleSecondary) {
                                                    return q93.b;
                                                }
                                                if (i == lsb.chat_common_text_contrast) {
                                                    return q93.c;
                                                }
                                                if (i == lsb.chat_common_text_contrastStatic) {
                                                    q93.getClass();
                                                } else if (i == lsb.chat_common_text_fileType) {
                                                    q93.getClass();
                                                    return -520093697;
                                                } else if (i == lsb.chat_common_text_negative) {
                                                    return q93.d;
                                                } else {
                                                    if (i == lsb.chat_common_text_primary) {
                                                        return q93.e;
                                                    }
                                                    if (i == lsb.chat_common_text_secondary) {
                                                        return q93.f;
                                                    }
                                                    if (i == lsb.chat_common_text_tertiary) {
                                                        return q93.g;
                                                    }
                                                    if (i == lsb.chat_common_text_themed) {
                                                        return q93.h;
                                                    }
                                                    int i9 = lsb.chat_topbar_background_default_neutral;
                                                    hxe hxe = Y;
                                                    exe exe = hxe.a;
                                                    if (i == i9) {
                                                        return exe.a.a;
                                                    }
                                                    if (i == lsb.chat_topbar_background_default_neutralFade) {
                                                        return exe.a.b;
                                                    }
                                                    if (i == lsb.chat_topbar_background_default_primary) {
                                                        exe.a.getClass();
                                                        return -855638017;
                                                    } else if (i == lsb.chat_topbar_background_default_themed) {
                                                        return exe.a.c;
                                                    } else {
                                                        if (i == lsb.chat_topbar_background_default_topbar) {
                                                            return exe.a.d;
                                                        }
                                                        if (i == lsb.chat_topbar_background_disabled_neutral) {
                                                            return exe.b.a;
                                                        }
                                                        if (i == lsb.chat_topbar_background_disabled_neutralFade) {
                                                            return exe.b.b;
                                                        }
                                                        if (i == lsb.chat_topbar_background_disabled_themed) {
                                                            return exe.b.c;
                                                        }
                                                        int i10 = lsb.chat_topbar_icon_default_contrast;
                                                        ixe ixe = hxe.b;
                                                        if (i == i10) {
                                                            return ixe.a.a;
                                                        }
                                                        if (i == lsb.chat_topbar_icon_default_contrastStatic) {
                                                            ixe.a.getClass();
                                                        } else if (i == lsb.chat_topbar_icon_default_neutralFade) {
                                                            return ixe.a.b;
                                                        } else {
                                                            if (i == lsb.chat_topbar_icon_default_primary) {
                                                                return ixe.a.c;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_default_quaternary) {
                                                                return ixe.a.d;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_default_secondary) {
                                                                return ixe.a.e;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_default_tertiary) {
                                                                return ixe.a.f;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_default_themed) {
                                                                return ixe.a.g;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_contrast) {
                                                                return ixe.b.a;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_contrastStatic) {
                                                                return ixe.b.b;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_negative) {
                                                                return ixe.b.c;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_neutralFade) {
                                                                return ixe.b.d;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_primary) {
                                                                return ixe.b.e;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_quaternary) {
                                                                return ixe.b.f;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_secondary) {
                                                                return ixe.b.g;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_tertiary) {
                                                                return ixe.b.h;
                                                            }
                                                            if (i == lsb.chat_topbar_icon_disabled_themed) {
                                                                return ixe.b.i;
                                                            }
                                                            int i11 = lsb.chat_topbar_stroke_separator_default_primary;
                                                            lxe lxe = hxe.c;
                                                            if (i == i11) {
                                                                return lxe.a.a.a;
                                                            }
                                                            if (i == lsb.chat_topbar_stroke_separator_default_secondary) {
                                                                return lxe.a.a.b;
                                                            }
                                                            int i12 = lsb.chat_topbar_text_default_contrast;
                                                            oxe oxe = hxe.d;
                                                            if (i == i12) {
                                                                return oxe.a.a;
                                                            }
                                                            if (i == lsb.chat_topbar_text_default_contrastStatic) {
                                                                oxe.a.getClass();
                                                            } else if (i == lsb.chat_topbar_text_default_primary) {
                                                                return oxe.a.b;
                                                            } else {
                                                                if (i == lsb.chat_topbar_text_default_secondary) {
                                                                    return oxe.a.c;
                                                                }
                                                                if (i == lsb.chat_topbar_text_default_themed) {
                                                                    return oxe.a.d;
                                                                }
                                                                if (i == lsb.chat_topbar_text_disabled_contrast) {
                                                                    return oxe.b.a;
                                                                }
                                                                if (i == lsb.chat_topbar_text_disabled_contrastStatic) {
                                                                    return oxe.b.b;
                                                                }
                                                                if (i == lsb.chat_topbar_text_disabled_primary) {
                                                                    return oxe.b.c;
                                                                }
                                                                if (i == lsb.chat_topbar_text_disabled_secondary) {
                                                                    return oxe.b.d;
                                                                }
                                                                if (i == lsb.chat_topbar_text_disabled_themed) {
                                                                    return oxe.b.e;
                                                                }
                                                                int i13 = lsb.chat_writebar_background_emojiArea;
                                                                i9g i9g = Z;
                                                                h9g h9g = i9g.a;
                                                                if (i == i13) {
                                                                    return h9g.a;
                                                                }
                                                                if (i == lsb.chat_writebar_background_input) {
                                                                    return h9g.b;
                                                                }
                                                                if (i == lsb.chat_writebar_background_neutralFade) {
                                                                    return h9g.c;
                                                                }
                                                                if (i == lsb.chat_writebar_background_surface) {
                                                                    return h9g.d;
                                                                }
                                                                int i14 = lsb.chat_writebar_icon_neutral;
                                                                j9g j9g = i9g.b;
                                                                if (i == i14) {
                                                                    return j9g.a;
                                                                }
                                                                if (i == lsb.chat_writebar_icon_neutralSecondary) {
                                                                    return j9g.b;
                                                                }
                                                                if (i == lsb.chat_writebar_icon_neutralTertiary) {
                                                                    return j9g.c;
                                                                }
                                                                if (i == lsb.chat_writebar_icon_themed) {
                                                                    return j9g.d;
                                                                }
                                                                if (i == lsb.chat_writebar_icon_verificationReplyTo) {
                                                                    return j9g.e;
                                                                }
                                                                int i15 = lsb.chat_writebar_stroke_areaSeparator;
                                                                k9g k9g = i9g.c;
                                                                if (i == i15) {
                                                                    return k9g.a;
                                                                }
                                                                if (i == lsb.chat_writebar_stroke_input) {
                                                                    return k9g.b;
                                                                }
                                                                if (i == lsb.chat_writebar_stroke_themed) {
                                                                    return k9g.c;
                                                                }
                                                                int i16 = lsb.chat_writebar_text_input;
                                                                l9g l9g = i9g.d;
                                                                if (i == i16) {
                                                                    return l9g.a;
                                                                }
                                                                if (i == lsb.chat_writebar_text_inputMDLink) {
                                                                    return l9g.b;
                                                                }
                                                                if (i == lsb.chat_writebar_text_inputPlaceholder) {
                                                                    return l9g.c;
                                                                }
                                                                if (i == lsb.chat_writebar_text_primary) {
                                                                    return l9g.d;
                                                                }
                                                                if (i == lsb.chat_writebar_text_replyMessage) {
                                                                    return l9g.e;
                                                                }
                                                                if (i == lsb.chat_writebar_text_replyTo) {
                                                                    return l9g.f;
                                                                }
                                                                if (i == lsb.chat_writebar_text_secondary) {
                                                                    return l9g.g;
                                                                }
                                                                if (i == lsb.chat_writebar_text_themed) {
                                                                    return l9g.h;
                                                                }
                                                                throw new IllegalArgumentException(zr6.h(i, "Unknown attr res passed "));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public void close() {
    }

    public ypa f() {
        return new bn6(xm6.n, (pm6) null);
    }

    public is0 g() {
        return c;
    }

    public Object get() {
        return new q67(Executors.newSingleThreadExecutor());
    }

    public i9g h() {
        return Z;
    }

    public is0 k() {
        return o;
    }

    public hxe m() {
        return Y;
    }

    public Uri p(String str) {
        if (str.equals("api")) {
            Uri uri = sl.a;
            return sl.a;
        }
        throw new NoHttpApiEndpointException(str);
    }

    public Object r(gy8 gy8) {
        return Integer.valueOf(lz7.L(gy8));
    }

    public v83 s() {
        return X;
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        ArrayList arrayList;
        boolean m = gy8.m();
        List list = nz4.a;
        if (!m) {
            return new d8b(list);
        }
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return new d8b(list);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            List list2 = null;
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("presetAvatars")) {
                    if (gy8.n().a() == 7) {
                        arrayList = new ArrayList();
                        int s02 = gy8.s0();
                        for (int i3 = 0; i3 < s02; i3++) {
                            arrayList.add(z04.S(gy8));
                        }
                    } else {
                        gy8.z();
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        list2 = x53.e0(arrayList);
                    }
                    if (list2 == null) {
                        list2 = list;
                    }
                    arrayList2.addAll(list2);
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 != 0) {
                            if (s3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th3;
                        }
                    }
                }
            }
        }
        return new d8b(arrayList2);
    }
}
