package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import one.me.android.MainActivity;

/* renamed from: hx9  reason: default package */
public final class hx9 implements nr2, b66, q7f, pic, en6, im9, fo7 {
    public static final hxe X = new hxe(new exe(new fxe(-15921907, 336136457, -11980601, -1), new gxe(2047675661, 168364297, -1723256633)), new ixe(new jxe(-1, 336136457, -15921907, -4276546, -11184811, -7566196, -11980601), new kxe(-1191182337, -1191182337, -1545253546, 168364297, -1552517514, -1552517514, -1552517514, -1552517514, -1723256633)), new lxe(new mxe(new nxe(688655374, 252447758))), new oxe(new pxe(-1, -15921907, -2062742259, -11980601), new qxe(-1543503873, -1191182337, -1552517514, -1552517514, -1723256633)));
    public static final i9g Y = new i9g(new h9g(-592138, -1, 336136457, -1), new j9g(-15987698, -7566196, -7566196, -11980601, 1879837710), new k9g(252447758, 252447758, -11980601), new l9g(-15987698, -11980601, 1712065550, -15987698, -1207170034, -2062808050, -2062808050, -11980601));
    public static final hx9 Z = new Object();
    public static final hx9 a = new Object();
    public static final is0 b;
    public static final is0 c;
    public static final v83 o;
    public static final hx9 s0 = new Object();
    public static final hx9 t0 = new Object();
    public static final hx9 u0 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [hx9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [hx9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [hx9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [hx9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [hx9, java.lang.Object] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1555484473, -1555484473, 1716072647);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(524890311, 4796615), new es0(1028206791, 4796615), new fs0(1028206791, 4796615));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-11980601, 340340935, -1, -2058800953);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -9810433, 1030376959, 342511103, -1, 342511103, -4112, 342511103, -1, 342511103, 2053787135, new int[]{-1, -1, -1}, new int[]{-1, -1});
        b = new is0(bs0, new js0(-1, -11980601, -16711919, -53188, -11980601, -1303826233, -16711919, -16711919, -8356967, -8356967, -11980601, -871625458, -1895035634, 1879837966, -1895035634), new ks0(-1, 340340935, -11980601, -1), new ls0(new ms0(-1, -9810433, -9810433, -1), -11980601, -11980601, -11980601, -15987442, -2062807794, -2062808050, -1207170034, -9810433, 16777215, -2062808050, -1207170034, -2062807794));
        as0 as03 = r1;
        as0 as04 = new as0(-1723256633, -1723256633, 1716072647);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(524890311, 4796615), new es0(1028206791, 4796615), new fs0(1028206791, 4796615));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-11980601, 524890311, -1, -2058800953);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1301099468, 177025996, 9253836, new int[]{1301099468, -2138229812});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -11980601, 1548300487, 340340935, -1442305, 340340935, 340340935, 524890311, -656897, 340340935, 2051569387, new int[]{-2432769, -2432769, -2432769}, new int[]{-2432769, -2432769});
        c = new is0(bs03, new js0(-2432769, -11980601, -1685946, -16711919, -11980601, -11980601, -11980601, -1, -2062744269, -2062744269, -16711919, -871561933, -1894972109, 1879901491, -1894972109), new ks0(-2432769, 340340935, -11980601, -1), new ls0(new ms0(-1, -11980601, -11980601, -1), -11980601, -11980601, -16711919, -15923917, -2062744269, -2062744269, -1207106253, -11980601, 16777215, -2062744269, -1207106253, -11980601));
        j73 j73 = new j73(new i73(-53188, -15921907, -11980601, -2693121), new k73(-15987442, -4933959, -11980601));
        l73 l73 = r9;
        l73 l732 = new l73(-857370754, -857370754, 15044478, -9199105, -9199105, 7578111, -3962899, -3962899, -5283609, -3587250, -3587250, 13189966, -14129921, -14129921, 2647295);
        n73 n73 = r31;
        n73 n732 = new n73(-371456, 1039815936, 704271616, -371456, -1543503873, 1024489791, 688945471, -15697601, -2409396, 1037777996, 702233676, -2409396, -16544549, 1023642843, 688098523, -16544549, 1033643952, 698099632, -6543440, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -7523380, 1030376959, 694832639, -7523380, -9158436, 1031028956, 695484636, -9158436);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(1308622847, new int[]{16777215, 1090519039, -2130706433}), new p73(-986638, new int[]{16777215, 1090519039, -2130706433}), new s73(new r73(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new u73(new t73(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1543503873, -520093697, -520093697}, -16769551, -16729857, 47359, -7798611, 8978605, -1, -2130706433);
        o = new v83(j73, new m73(l73, n73, q73, v73, -11980601, 1543503872, -2055524153, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521230, -871625714, -1727263730, 1493172224, -11980601, -1184014, -3962899, new int[]{-2053557249, -2053557249}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-1732738, -3962899}), new w83(-11980601, -11980601, -53188, -2062808050, -11980601, -1), new b93(new c93(251658240, 167772160), new d93(251658240), new e93(251658240)), new j93(new h93(new g93(new f93(-14810958), 520093696), new i93(-1723256633, 168627469, 2047675661)), new k93(new l93(-1545253546, -1723256633)), new m93(new n93(-1543503873, -1191182337, -1545253546, -1552977290, -1723256633))), new o93(new p93(688655374), -1, 1308622847), new q93(-1, -15987698, -1, -53188, -15987698, -2062808050, 1712065550, -11980601));
    }

    public static final void j(hx9 hx9, String str) {
        us7 us7;
        hx9.getClass();
        int s = au1.s(2);
        if (s == 0) {
            us7 = us7.X;
        } else if (s == 1) {
            us7 = us7.Y;
        } else if (s == 2) {
            us7 = us7.Z;
        } else if (s == 3) {
            us7 = us7.s0;
        } else if (s != 4) {
            throw new NoWhenBranchMatchedException();
        } else {
            return;
        }
        hm9.N(us7, "Scout", str, new Object[0]);
    }

    public static final String l(sh0 sh0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = sh0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (sh0.b != 0) {
                int u = sh0.u();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = u;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 2:
                            break;
                        case 1:
                            str = "=";
                            break;
                        case 3:
                        case 5:
                            str = "{";
                            break;
                        case 4:
                            str = "{:";
                            break;
                        case 6:
                        case 7:
                            str = "[";
                            break;
                        default:
                            throw new IllegalArgumentException(zr6.h(i3, str));
                    }
                    sb.append(str);
                    sh0.w(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(zr6.h(i, "Illegal Capacity: "));
    }

    public static ece n(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            u41 u41 = (u41) it.next();
            int i = sag.a[u41.a.a.ordinal()];
            fp1 fp1 = u41.a;
            if (i == 1) {
                hashSet.add(fp1.b);
            } else if (i == 2) {
                hashSet2.add(fp1.b);
            } else if (i == 3) {
                hashSet3.add(fp1.b);
            }
        }
        return new ece(hashSet2);
    }

    public static d6c q(int i) {
        Object obj;
        v25 v25 = d6c.X;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((d6c) obj).a == i) {
                break;
            }
        }
        d6c d6c = (d6c) obj;
        if (d6c != null) {
            return d6c;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unknown reactionType = "));
    }

    public static u61 r(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -2105248304) {
            if (hashCode != -1881579439) {
                if (hashCode != -1284823979) {
                    if (hashCode == 65120 && str.equals("ASR")) {
                        return u61.o;
                    }
                } else if (str.equals("ADD_PARTICIPANT")) {
                    return u61.a;
                }
            } else if (str.equals("RECORD")) {
                return u61.b;
            }
        } else if (str.equals("MOVIE_SHARE")) {
            return u61.c;
        }
        return null;
    }

    public static void t(Context context, Uri uri, uia uia, q12 q12, int i) {
        int i2 = MainActivity.a1;
        Uri uri2 = null;
        if ((i & 2) != 0) {
            uri = null;
        }
        if ((i & 4) != 0) {
            uia = null;
        }
        m56 m56 = q12;
        if ((i & 8) != 0) {
            m56 = new g27(10);
        }
        Intent intent = new Intent(context, MainActivity.class);
        if (uri != null) {
            uri2 = uri;
        }
        intent.putExtra("deep_link", uri2);
        intent.putExtra("snackbar", uia);
        m56.invoke(intent);
        context.startActivity(intent);
    }

    public void a() {
    }

    public Object apply(Object obj) {
        return new sa3(2, new ia4(1, (tp4) obj));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00b5 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(java.lang.String r5) {
        /*
            r4 = this;
            nud[] r4 = com.facebook.soloader.SoLoader.e
            r0 = 0
            if (r4 != 0) goto L_0x0065
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r4.readLock()
            r1.lock()
            nud[] r1 = com.facebook.soloader.SoLoader.e     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = "http://www.android.com/"
            java.lang.String r2 = "java.vendor.url"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ all -> 0x0051 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = com.facebook.soloader.SoLoader.h()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0027
            goto L_0x0053
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "SoLoader.init() not yet called"
            r4.<init>(r5)     // Catch:{ all -> 0x0051 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x002f:
            java.lang.Class<com.facebook.soloader.SoLoader> r1 = com.facebook.soloader.SoLoader.class
            monitor-enter(r1)     // Catch:{ all -> 0x0051 }
            java.util.HashSet r2 = com.facebook.soloader.SoLoader.h     // Catch:{ all -> 0x0040 }
            boolean r2 = r2.contains(r5)     // Catch:{ all -> 0x0040 }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x0042
            java.lang.System.loadLibrary(r5)     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x0040:
            r4 = move-exception
            goto L_0x004f
        L_0x0042:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0066
        L_0x004f:
            monitor-exit(r1)     // Catch:{ all -> 0x0040 }
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r4 = move-exception
            goto L_0x005b
        L_0x0053:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r4.readLock()
            r4.unlock()
            goto L_0x0065
        L_0x005b:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r5.readLock()
            r5.unlock()
            throw r4
        L_0x0065:
            r2 = r0
        L_0x0066:
            if (r2 == 0) goto L_0x006d
            boolean r4 = r2.booleanValue()
            goto L_0x0086
        L_0x006d:
            boolean r4 = com.facebook.soloader.SoLoader.k
            if (r4 != 0) goto L_0x0076
            boolean r4 = defpackage.hm9.M(r5)
            goto L_0x0086
        L_0x0076:
            int r4 = com.facebook.soloader.SoLoader.m
            r1 = 2
            if (r4 == r1) goto L_0x007c
            r1 = 3
        L_0x007c:
            java.lang.String r4 = java.lang.System.mapLibraryName(r5)
            r1 = r0
        L_0x0081:
            r2 = 0
            boolean r4 = com.facebook.soloader.SoLoader.i(r4, r5, r2, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0087 }
        L_0x0086:
            return r4
        L_0x0087:
            r2 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.lock()
            if (r1 != 0) goto L_0x009c
            sh0 r1 = com.facebook.soloader.SoLoader.d()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            goto L_0x009c
        L_0x0098:
            r4 = move-exception
            goto L_0x00b7
        L_0x009a:
            r4 = move-exception
            goto L_0x00b6
        L_0x009c:
            if (r1 == 0) goto L_0x00c1
            nud[] r3 = com.facebook.soloader.SoLoader.e     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            boolean r3 = r1.q(r2, r3)     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            if (r3 == 0) goto L_0x00c1
            java.util.concurrent.atomic.AtomicInteger r3 = com.facebook.soloader.SoLoader.f     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            r3.getAndIncrement()     // Catch:{ NoBaseApkException -> 0x009a, Exception -> 0x00b5 }
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r2.writeLock()
            r2.unlock()
            goto L_0x0081
        L_0x00b5:
            throw r2     // Catch:{ all -> 0x0098 }
        L_0x00b6:
            throw r4     // Catch:{ all -> 0x0098 }
        L_0x00b7:
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r5.writeLock()
            r5.unlock()
            throw r4
        L_0x00c1:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = com.facebook.soloader.SoLoader.c
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx9.b(java.lang.String):boolean");
    }

    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83 = o;
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
                                                    hxe hxe = X;
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
                                                                i9g i9g = Y;
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

    public void e(Object obj) {
        try {
            q43.a((Closeable) obj);
        } catch (IOException unused) {
        }
    }

    public zpa f() {
        return new cn6();
    }

    public is0 g() {
        return b;
    }

    public i9g h() {
        return Y;
    }

    public zpa i(ym6 ym6, qm6 qm6) {
        return new cn6(ym6, qm6);
    }

    public is0 k() {
        return c;
    }

    public void load() {
        synchronized (nu0.z0) {
            Object obj = nu0.A0;
            synchronized (obj) {
                if (!nu0.B0) {
                    long a2 = nu0.a();
                    synchronized (obj) {
                        nu0.C0 = a2;
                        nu0.B0 = true;
                    }
                }
            }
        }
    }

    public hxe m() {
        return X;
    }

    public HashMap o(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) ek.a.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            ek.a(cls, hashMap3, new HashMap());
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                hashMap.put(entry.getKey(), new e45(obj, (Method) entry.getValue()));
            }
        }
        return hashMap;
    }

    public HashMap p(Object obj) {
        ConcurrentHashMap concurrentHashMap = ek.a;
        Class<?> cls = obj.getClass();
        HashMap hashMap = new HashMap();
        Map map = (Map) ek.b.get(cls);
        HashMap hashMap2 = map;
        if (map == null) {
            HashMap hashMap3 = new HashMap();
            ek.a(cls, new HashMap(), hashMap3);
            hashMap2 = hashMap3;
        }
        if (!hashMap2.isEmpty()) {
            for (Map.Entry entry : hashMap2.entrySet()) {
                HashSet hashSet = new HashSet();
                for (Method t35 : (Set) entry.getValue()) {
                    hashSet.add(new t35(obj, t35));
                }
                hashMap.put(entry.getKey(), hashSet);
            }
        }
        return hashMap;
    }

    public v83 s() {
        return o;
    }
}
