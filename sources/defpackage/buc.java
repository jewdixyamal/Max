package defpackage;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.HttpDataSource$CleartextNotPermittedException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.HttpHost;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: buc  reason: default package */
public final class buc implements nr2, b66, ol6, qj3, q7f, iud, n43, lm9, go7, ele, edc {
    public static final hxe X = new hxe(new exe(new fxe(-1, 352321535, -16745729, -14803164), new gxe(1728053247, 184549375, -1728021761)), new ixe(new jxe(-15921907, 352321535, -855638017, -11579312, 1895825407, -8815492, -16745729), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548240711, -1548240711, -1548240711, -1548240711, -1728021761)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -16745729), new qxe(-1559425779, 2063597567, -1548240711, -1548240711, -1728021761)));
    public static final i9g Y = new i9g(new h9g(-15198184, -14803164, 401074151, -14803164), new j9g(-855638017, 1895825407, -8815492, -16745729, 1895825407), new k9g(266856423, 15198183, -16745729), new l9g(-1579033, -16745729, 1474815975, -1, -1108875289, -2130706433, -2130706433, -16745729));
    public static final buc Z = new Object();
    public static final buc a = new Object();
    public static final is0 b;
    public static final is0 c;
    public static final v83 o;
    public static final buc s0 = new Object();
    public static final buc t0 = new Object();
    public static final buc u0 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [buc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [buc, java.lang.Object] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1308591361, -1728021761, 1711307519);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(694773221, 6907365), new es0(1030317541, 6907365), new fs0(1382641064, 6909352));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-16745729, 704643071, -16745729, 704643071);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -3158065, -2133864497, 536870911, -14671838, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14671838, -14671838, -14671838}, new int[]{-14671838, -14671838});
        b = new is0(bs0, new js0(-14671838, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14078413, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -12542721, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -1107296257, -2130706433));
        as0 as03 = r1;
        as0 as04 = new as0(-1728021761, -1728021761, 1711307519);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(704643071, 16777215), new es0(1030317541, 6907365), new fs0(1382641064, 6909352));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-1, 704643071, -16745729, 704643071);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -520093697, -2130706433, 704643071, -14526260, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-12310068, -14528027, -16742196}, new int[]{-12310068, -16742196});
        c = new is0(bs03, new js0(-15375889, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-15375889, 452984831, -2046820353, -1), new ls0(new ms0(-16745729, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
        j73 j73 = new j73(new i73(-48049, -1579033, -16745729, -5058310), new k73(-1, 1895825407, -16745729));
        l73 l73 = r9;
        l73 l732 = new l73(0, 0, 0, 0, 0, 0, -15856111, -15856111, 0, 0, 0, 0, 0, 0, 0);
        n73 n73 = r31;
        n73 n732 = new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -14528027, 721429580, 1305464783, -1, -10669092, 721429580, 1305464783, -1);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1558175710, -534765534, -534765534}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831);
        o = new v83(j73, new m73(l73, n73, q73, v73, -16745729, 1933394762, 352321535, -868400310, -12762294, -15263716, -1, 536870911, 402653183, -16745729, -1559425779, -871625458, -1727263474, 0, -16745729, -12500154, -15856111, new int[]{352321535, 352321535}, new int[]{352321535, 352321535}, new int[]{-650625467, -1304936891, -1942471099}, new int[]{-15856111, -15856111}), new w83(-16745729, -520093697, -3259817, -2130706433, -16745729, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-16751924), 536870911), new i93(-1728021761, 184549375, 1728053247)), new k93(new l93(1207959551, -1728021761)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1728021761))), new o93(new p93(536870911), -855638017, 1882734149), new q93(-855638017, -855638017, -15987442, -3259817, -520093697, 1895825407, 1207959551, -16745729));
    }

    public static ArrayList A(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int z0 = w9e.z0(str, '&', i, false, 4);
            if (z0 == -1) {
                z0 = str.length();
            }
            int z02 = w9e.z0(str, '=', i, false, 4);
            if (z02 == -1 || z02 > z0) {
                arrayList.add(str.substring(i, z0));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, z02));
                arrayList.add(str.substring(z02 + 1, z0));
            }
            i = z0 + 1;
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: bt0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: bt0} */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.lang.Object, bt0] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
        /*
            r0 = r17
            r1 = r20
            r2 = r25 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r2 = r3
            goto L_0x000d
        L_0x000b:
            r2 = r18
        L_0x000d:
            r4 = r25 & 2
            if (r4 == 0) goto L_0x0016
            int r4 = r17.length()
            goto L_0x0018
        L_0x0016:
            r4 = r19
        L_0x0018:
            r5 = r25 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r3
            goto L_0x0020
        L_0x001e:
            r5 = r21
        L_0x0020:
            r6 = r25 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r3
            goto L_0x0028
        L_0x0026:
            r6 = r22
        L_0x0028:
            r7 = r25 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r3
            goto L_0x0030
        L_0x002e:
            r7 = r23
        L_0x0030:
            r8 = r25 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r3
            goto L_0x0038
        L_0x0036:
            r8 = r24
        L_0x0038:
            r9 = r2
        L_0x0039:
            if (r9 >= r4) goto L_0x0112
            int r10 = r0.codePointAt(r9)
            r11 = 32
            r12 = 128(0x80, float:1.794E-43)
            r13 = 43
            r14 = 37
            r15 = 127(0x7f, float:1.78E-43)
            if (r10 < r11) goto L_0x006f
            if (r10 == r15) goto L_0x006f
            if (r10 < r12) goto L_0x0051
            if (r8 == 0) goto L_0x006f
        L_0x0051:
            char r12 = (char) r10
            boolean r12 = defpackage.w9e.q0(r1, r12)
            if (r12 != 0) goto L_0x006f
            if (r10 != r14) goto L_0x0064
            if (r5 == 0) goto L_0x006f
            if (r6 == 0) goto L_0x0064
            boolean r12 = x(r9, r4, r0)
            if (r12 == 0) goto L_0x006f
        L_0x0064:
            if (r10 != r13) goto L_0x0069
            if (r7 == 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            int r10 = java.lang.Character.charCount(r10)
            int r9 = r9 + r10
            goto L_0x0039
        L_0x006f:
            bt0 r10 = new bt0
            r10.<init>()
            r10.z0(r2, r9, r0)
            r2 = 0
        L_0x0078:
            if (r9 >= r4) goto L_0x010d
            int r12 = r0.codePointAt(r9)
            if (r5 == 0) goto L_0x0094
            r14 = 9
            if (r12 == r14) goto L_0x0091
            r14 = 10
            if (r12 == r14) goto L_0x0091
            r14 = 12
            if (r12 == r14) goto L_0x0091
            r14 = 13
            if (r12 == r14) goto L_0x0091
            goto L_0x0094
        L_0x0091:
            r13 = 128(0x80, float:1.794E-43)
            goto L_0x00ca
        L_0x0094:
            if (r12 != r13) goto L_0x00a7
            if (r7 == 0) goto L_0x00a7
            if (r5 == 0) goto L_0x009d
            java.lang.String r14 = "+"
            goto L_0x009f
        L_0x009d:
            java.lang.String r14 = "%2B"
        L_0x009f:
            int r13 = r14.length()
            r10.z0(r3, r13, r14)
            goto L_0x0091
        L_0x00a7:
            if (r12 < r11) goto L_0x00cd
            if (r12 == r15) goto L_0x00cd
            r13 = 128(0x80, float:1.794E-43)
            if (r12 < r13) goto L_0x00b1
            if (r8 == 0) goto L_0x00cf
        L_0x00b1:
            char r14 = (char) r12
            boolean r14 = defpackage.w9e.q0(r1, r14)
            if (r14 != 0) goto L_0x00cf
            r14 = 37
            if (r12 != r14) goto L_0x00c7
            if (r5 == 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00c7
            boolean r14 = x(r9, r4, r0)
            if (r14 != 0) goto L_0x00c7
            goto L_0x00cf
        L_0x00c7:
            r10.B0(r12)
        L_0x00ca:
            r11 = 37
            goto L_0x0100
        L_0x00cd:
            r13 = 128(0x80, float:1.794E-43)
        L_0x00cf:
            if (r2 != 0) goto L_0x00d6
            bt0 r2 = new bt0
            r2.<init>()
        L_0x00d6:
            r2.B0(r12)
        L_0x00d9:
            boolean r14 = r2.B()
            if (r14 != 0) goto L_0x00ca
            byte r14 = r2.readByte()
            r3 = r14 & 255(0xff, float:3.57E-43)
            r11 = 37
            r10.u0(r11)
            char[] r16 = defpackage.vq6.j
            int r3 = r3 >> 4
            r3 = r3 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = r14 & 15
            char r3 = r16[r3]
            r10.u0(r3)
            r3 = 0
            r11 = 32
            goto L_0x00d9
        L_0x0100:
            int r3 = java.lang.Character.charCount(r12)
            int r9 = r9 + r3
            r14 = r11
            r3 = 0
            r11 = 32
            r13 = 43
            goto L_0x0078
        L_0x010d:
            java.lang.String r0 = r10.p0()
            goto L_0x0116
        L_0x0112:
            java.lang.String r0 = r0.substring(r2, r4)
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buc.e(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
    }

    public static int t(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 3213448) {
            if (hashCode == 99617003 && str.equals("https")) {
                return 443;
            }
        } else if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
            return 80;
        }
        return -1;
    }

    public static b11 u(ty4 ty4, wn7 wn7) {
        int i;
        IOException iOException = wn7.a;
        if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) || ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).c) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (ty4.a(1)) {
            return new b11(1, 2, 300000);
        }
        if (ty4.a(2)) {
            return new b11(2, 2, 60000);
        }
        return null;
    }

    public static long w(wn7 wn7) {
        Throwable th = wn7.a;
        if (!(th instanceof ParserException) && !(th instanceof FileNotFoundException) && !(th instanceof HttpDataSource$CleartextNotPermittedException) && !(th instanceof Loader$UnexpectedLoaderException)) {
            int i = DataSourceException.b;
            while (th != null) {
                if (!(th instanceof DataSourceException) || ((DataSourceException) th).a != 2008) {
                    th = th.getCause();
                }
            }
            return (long) Math.min((wn7.b - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean x(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && naf.q(str.charAt(i + 1)) != -1 && naf.q(str.charAt(i3)) != -1;
    }

    public static void y() {
        xx6 i = y8a.a.i();
        if (i != null) {
            i.b(1);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, bt0] */
    public static String z(int i, String str, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        int i6 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                ? obj = new Object();
                obj.z0(i, i4, str);
                while (i4 < i2) {
                    int codePointAt = str.codePointAt(i4);
                    if (codePointAt == 37 && (i5 = i4 + 2) < i2) {
                        int q = naf.q(str.charAt(i4 + 1));
                        int q2 = naf.q(str.charAt(i5));
                        if (!(q == -1 || q2 == -1)) {
                            obj.u0((q << 4) + q2);
                            i4 = Character.charCount(codePointAt) + i5;
                        }
                    } else if (codePointAt == 43 && z) {
                        obj.u0(32);
                        i4++;
                    }
                    obj.B0(codePointAt);
                    i4 += Character.charCount(codePointAt);
                }
                return obj.p0();
            }
            i6 = i4 + 1;
        }
        return str.substring(i, i2);
    }

    public void a() {
    }

    public void accept(Object obj) {
        int i = x9c.g;
        hm9.p("x9c", "Can't add to recents", (Throwable) obj);
    }

    public Object apply(Object obj) {
        return ((OneMeRoomDatabase) obj).z();
    }

    public boolean b() {
        return true;
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

    public void f() {
    }

    public is0 g() {
        return b;
    }

    public i9g h() {
        return Y;
    }

    public void i(String str) {
    }

    public void j(String str, Throwable th) {
    }

    public is0 k() {
        return c;
    }

    public long l() {
        return System.currentTimeMillis();
    }

    public void load() {
        synchronized (tu0.h) {
            Object obj = tu0.i;
            synchronized (obj) {
                if (!tu0.j) {
                    long a2 = tu0.a();
                    synchronized (obj) {
                        tu0.k = a2;
                        tu0.j = true;
                    }
                }
            }
        }
    }

    public hxe m() {
        return X;
    }

    public boolean n(long j) {
        return System.currentTimeMillis() < j;
    }

    public void o(Throwable th) {
        if (th != null) {
            th.getMessage();
        }
    }

    public long p(int i, long j, float f) {
        if (i > 6) {
            i = 6;
        }
        long pow = ((long) Math.pow(2.0d, (double) i)) * 1000;
        return pow + ((long) (((float) pow) * f)) + j;
    }

    public boolean q(UnsatisfiedLinkError unsatisfiedLinkError, nud[] nudArr) {
        String str = unsatisfiedLinkError instanceof mud ? ((mud) unsatisfiedLinkError).a : null;
        Objects.toString(unsatisfiedLinkError);
        if (str != null) {
            ", retrying for specific library ".concat(str);
        }
        for (p5f p5f : nudArr) {
            if (p5f instanceof p5f) {
                p5f p5f2 = p5f;
                p5f.b();
                p5f2.getClass();
                File file = p5f2.a;
                try {
                    mhe.d(file, new File(file, "dso_lock")).close();
                } catch (Exception unused) {
                    Objects.toString(file);
                }
            }
        }
        return true;
    }

    public void r(tld tld, Throwable th) {
        Object b2 = tld.b();
        ta5.j(o43.class, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(tld)), b2 == null ? null : b2.getClass().getName());
    }

    public v83 s() {
        return o;
    }

    public int v(int i) {
        return i == 7 ? 6 : 3;
    }
}
