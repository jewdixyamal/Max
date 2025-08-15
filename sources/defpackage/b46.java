package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b46  reason: default package */
public final class b46 implements bi, nr2, b66, s43, mbe, gy7, kxd {
    public static final is0 X;
    public static final v83 Y;
    public static final hxe Z = new hxe(new exe(new fxe(-15921907, 336136457, -15757630, -1), new gxe(2047675661, 168364297, -1727033662)), new ixe(new jxe(-1, 336136457, -15921907, -4407874, -11447211, -7762804, -15757630), new kxe(-1191182337, -1191182337, -1545253546, 168364297, -1552977290, -1552977290, -1552977290, -1552977290, -1727033662)), new lxe(new mxe(new nxe(688655630, 252448014))), new oxe(new pxe(-1, -15921907, -2062742259, -15757630), new qxe(-1543503873, -1191182337, -1552977290, -1552977290, -1728021761)));
    public static final b46 a = new Object();
    public static final b46 b = new Object();
    public static final b46 c = new Object();
    public static final is0 o;
    public static final i9g s0 = new i9g(new h9g(-592138, -1, 336136457, -1), new j9g(-15987442, -7762804, -7762804, -15757630, 1879837966), new k9g(252448014, 252448014, -15757630), new l9g(-15987442, -15757630, 1712065806, -15987442, -1207169778, -2062807794, -2062807794, -15757630));
    public static final b46 t0 = new Object();
    public static final b46 u0 = new Object();
    public static final wlf v0 = new wlf(new float[8]);

    /* JADX WARNING: type inference failed for: r0v0, types: [b46, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [b46, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [b46, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [b46, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [b46, java.lang.Object] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1559261502, -1559261502, 1712295618);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(521113282, 1019586), new es0(1024429762, 1019586), new fs0(1024231611, 821435));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-15757630, 336563906, -1, -2062577982);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -15757630, 1024429762, 336563906, -1, 336563906, -4112, 336563906, -1, 336563906, 2047839938, new int[]{-1, -1, -1}, new int[]{-1, -1});
        o = new is0(bs0, new js0(-1, -15757630, -16711919, -53188, -15757630, -1307603262, -16711919, -16711919, -8682855, -8682855, -15757630, -1559491314, -1895035634, 1879837966, -1895035634), new ks0(-1, 336563906, -15757630, -1), new ls0(new ms0(-1, -15757630, -15757630, -1), -15757630, -15757630, -15757630, -15987442, -2062807794, -2062807794, -1207169778, -15757630, 16777215, -2062807794, -1207169778, -2062807794));
        as0 as03 = r1;
        as0 as04 = new as0(-1728006644, -1728006644, 1711322636);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(521113282, 1019586), new es0(1024429762, 1019586), new fs0(1024231611, 821435));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-15757630, 521113282, -1, -2062577982);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1292865218, 168791746, 1019586, new int[]{1292865218, -2146464062});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -15757630, 1544523458, 336563906, -1442305, 336563906, 336563906, 521113282, -656897, 336563906, 2051569387, new int[]{-1442305, -1442305, -1442305}, new int[]{-1442305, -1442305});
        X = new is0(bs03, new js0(-1442305, -15757630, -1685946, -16711919, -15757630, -15757630, -15757630, -1, -2063258820, -2063258820, -16711919, -1559942340, -1895486660, 1879386940, -1895486660), new ks0(-1442305, 336563906, -15757630, -1), new ls0(new ms0(-1, -15757630, -15757630, -1), -15757630, -15757630, -16711919, -16438468, -2063258820, -2063258820, -1207620804, -15757630, 16777215, -2063258820, -1207620804, -15757630));
        j73 j73 = new j73(new i73(-53188, -15921907, -15757630, -2693121), new k73(-15987442, -4933959, -15757630));
        l73 l73 = r9;
        l73 l732 = new l73(0, 0, 0, 0, 0, 0, -6695465, -8340225, 1291877119, 0, 0, 0, 0, 0, 0);
        n73 n73 = r31;
        n73 n732 = new n73(-371456, 1039815936, 704271616, -371456, -1543503873, 1024489791, 688945471, -15697601, -2409396, 1037777996, 702233676, -2409396, -16544549, 1023642843, 688098523, -16544549, 1033643952, 698099632, -6543440, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -15757630, 1024429762, 688885442, -15757630, -9158436, 1031028956, 695484636, -9158436);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(1308622847, new int[]{16777215, 1090519039, -2130706433}), new p73(-986638, new int[]{16777215, 1090519039, -2130706433}), new s73(new r73(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new u73(new t73(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1543503873, -520093697, -520093697}, -16769551, -16729857, 47359, -7798611, 8978605, -1, -2130706433);
        Y = new v83(j73, new m73(l73, n73, q73, v73, -15757630, 1543503872, -2062577982, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521486, -871625458, -1727263474, 1291877119, -15757630, -1184014, -8734748, new int[]{-2062577982, -2062577982}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6695465, -8340225}), new w83(-15757630, -15757630, -53188, -2062807794, -15757630, -855638017), new b93(new c93(251658240, 167772160), new d93(251658240), new e93(251658240)), new j93(new h93(new g93(new f93(-16089170), 520093696), new i93(-1727033662, 168627469, 2047675661)), new k93(new l93(-1545253546, -1727033662)), new m93(new n93(-1543503873, -1191182337, -1545253546, -1552977290, -1727033662))), new o93(new p93(688655630), -1, 1308622847), new q93(-1, -15987442, -1, -53188, -15987698, -2062808050, 1712065550, -15757630));
    }

    public static ArrayList f(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((sob) next) != sob.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((sob) it.next()).a);
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, bt0] */
    public static byte[] i(List list) {
        ? obj = new Object();
        Iterator it = f(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.u0(str.length());
            obj.z0(0, str.length(), str);
        }
        return obj.n0(obj.b);
    }

    public static ohc n(byte[] bArr, rl8 rl8, int i) {
        if ((i & 1) != 0) {
            rl8 = null;
        }
        int length = bArr.length;
        long length2 = (long) bArr.length;
        long j = (long) 0;
        long j2 = (long) length;
        byte[] bArr2 = naf.a;
        if ((j | j2) >= 0 && j <= length2 && length2 - j >= j2) {
            return new ohc(bArr, rl8, length, 0);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static rh5 o(String str, String str2) {
        return new rh5(str, 1, str2.getBytes(a52.a));
    }

    public static boolean p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static z61 q(JSONObject jSONObject) {
        String optString;
        bg1 b2;
        String optString2 = jSONObject.optString("key");
        int i = 0;
        jSONObject.optInt("totalCount", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return new z61(optString2, nz4.a);
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        if (length >= 0) {
            while (true) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (!(optJSONObject == null || (optString = optJSONObject.optString("participantId")) == null || (b2 = bg1.b(optString)) == null)) {
                    arrayList.add(b2);
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return new z61(optString2, arrayList);
    }

    public static goe r(int i) {
        Object obj;
        goe.b.getClass();
        Iterator it = goe.Z.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((goe) obj).a == i) {
                break;
            }
        }
        goe goe = (goe) obj;
        if (goe != null) {
            return goe;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for TaskStatus"));
    }

    public static iua t(int i) {
        Object obj;
        iua.b.getClass();
        Iterator it = iua.e1.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((iua) obj).a == i) {
                break;
            }
        }
        iua iua = (iua) obj;
        if (iua != null) {
            return iua;
        }
        throw new IllegalArgumentException(wg0.g(i, "No such value ", " for PersistableTaskType"));
    }

    public boolean a(qy5 qy5) {
        String str = qy5.n;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    public Object apply(Object obj) {
        ref a2;
        np4 np4 = (np4) obj;
        fp4 fp4 = np4.a;
        ep4 ep4 = new ep4(fp4.a, fp4.b);
        i20 i20 = np4.e;
        if (i20 == null) {
            a2 = null;
        } else {
            i20 i202 = new i20(1);
            i202.a = i20.a;
            i202.c = i20.c;
            i202.b = i20.b;
            i202.d = i20.d;
            a2 = i202.a();
        }
        ref ref = a2;
        return new lp4(ep4, np4.b, np4.c, np4.d, ref);
    }

    public Object b(ova ova) {
        return Integer.valueOf(ova.U0);
    }

    public int c(int i) {
        int i2 = lsb.chat_common_action_background_error;
        v83 v83 = Y;
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
                                                    hxe hxe = Z;
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
                                                                i9g i9g = s0;
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

    /* JADX WARNING: type inference failed for: r2v1, types: [obe, java.lang.Object, ty2] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.obe e(defpackage.qy5 r13) {
        /*
            r12 = this;
            r12 = 1
            r0 = 0
            r1 = -1
            java.lang.String r2 = r13.n
            if (r2 == 0) goto L_0x0123
            java.util.List r13 = r13.q
            int r3 = r2.hashCode()
            switch(r3) {
                case -1351681404: goto L_0x0060;
                case -1248334819: goto L_0x0055;
                case -1026075066: goto L_0x004a;
                case -1004728940: goto L_0x003f;
                case 691401887: goto L_0x0034;
                case 822864842: goto L_0x0029;
                case 1668750253: goto L_0x001e;
                case 1693976202: goto L_0x0013;
                default: goto L_0x0010;
            }
        L_0x0010:
            r3 = r1
            goto L_0x006a
        L_0x0013:
            java.lang.String r3 = "application/ttml+xml"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x001c
            goto L_0x0010
        L_0x001c:
            r3 = 7
            goto L_0x006a
        L_0x001e:
            java.lang.String r3 = "application/x-subrip"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0010
        L_0x0027:
            r3 = 6
            goto L_0x006a
        L_0x0029:
            java.lang.String r3 = "text/x-ssa"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0032
            goto L_0x0010
        L_0x0032:
            r3 = 5
            goto L_0x006a
        L_0x0034:
            java.lang.String r3 = "application/x-quicktime-tx3g"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x003d
            goto L_0x0010
        L_0x003d:
            r3 = 4
            goto L_0x006a
        L_0x003f:
            java.lang.String r3 = "text/vtt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0048
            goto L_0x0010
        L_0x0048:
            r3 = 3
            goto L_0x006a
        L_0x004a:
            java.lang.String r3 = "application/x-mp4-vtt"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0053
            goto L_0x0010
        L_0x0053:
            r3 = 2
            goto L_0x006a
        L_0x0055:
            java.lang.String r3 = "application/pgs"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x005e
            goto L_0x0010
        L_0x005e:
            r3 = r12
            goto L_0x006a
        L_0x0060:
            java.lang.String r3 = "application/dvbsubs"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0069
            goto L_0x0010
        L_0x0069:
            r3 = r0
        L_0x006a:
            switch(r3) {
                case 0: goto L_0x009f;
                case 1: goto L_0x0097;
                case 2: goto L_0x008f;
                case 3: goto L_0x0087;
                case 4: goto L_0x0081;
                case 5: goto L_0x007b;
                case 6: goto L_0x0075;
                case 7: goto L_0x006f;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x0123
        L_0x006f:
            r3f r12 = new r3f
            r12.<init>()
            return r12
        L_0x0075:
            tae r12 = new tae
            r12.<init>()
            return r12
        L_0x007b:
            swd r12 = new swd
            r12.<init>(r13)
            return r12
        L_0x0081:
            x3f r12 = new x3f
            r12.<init>(r13)
            return r12
        L_0x0087:
            bdb r12 = new bdb
            r13 = 14
            r12.<init>((int) r13)
            return r12
        L_0x008f:
            w4d r12 = new w4d
            r13 = 20
            r12.<init>((int) r13)
            return r12
        L_0x0097:
            a8g r12 = new a8g
            r13 = 10
            r12.<init>((int) r13)
            return r12
        L_0x009f:
            ty2 r2 = new ty2
            r2.<init>()
            wpa r3 = new wpa
            java.lang.Object r13 = r13.get(r0)
            byte[] r13 = (byte[]) r13
            r3.<init>((byte[]) r13)
            int r13 = r3.A()
            int r3 = r3.A()
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r2.a = r4
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            r4.setStyle(r5)
            android.graphics.PorterDuffXfermode r5 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC
            r5.<init>(r6)
            r4.setXfermode(r5)
            r5 = 0
            r4.setPathEffect(r5)
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r2.b = r4
            android.graphics.Paint$Style r6 = android.graphics.Paint.Style.FILL
            r4.setStyle(r6)
            android.graphics.PorterDuffXfermode r6 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.DST_OVER
            r6.<init>(r7)
            r4.setXfermode(r6)
            r4.setPathEffect(r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>()
            r2.c = r4
            ot4 r4 = new ot4
            r8 = 0
            r9 = 719(0x2cf, float:1.008E-42)
            r6 = 719(0x2cf, float:1.008E-42)
            r7 = 575(0x23f, float:8.06E-43)
            r10 = 0
            r11 = 575(0x23f, float:8.06E-43)
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.o = r4
            nt4 r4 = new nt4
            r5 = -8421505(0xffffffffff7f7f7f, float:-3.3961514E38)
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int[] r1 = new int[]{r0, r1, r6, r5}
            int[] r5 = defpackage.ty2.g()
            int[] r6 = defpackage.ty2.h()
            r4.<init>(r0, r1, r5, r6)
            r2.X = r4
            yt4 r0 = new yt4
            r0.<init>(r13, r3, r12)
            r2.Y = r0
            return r2
        L_0x0123:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = "Unsupported MIME type: "
            java.lang.String r13 = defpackage.wg0.i(r13, r2)
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b46.e(qy5):obe");
    }

    public is0 g() {
        return o;
    }

    public i9g h() {
        return s0;
    }

    public long j(long j) {
        return -1;
    }

    public is0 k() {
        return X;
    }

    public int l(qy5 qy5) {
        String str = qy5.n;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = 7;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                case 6:
                case 7:
                    return 1;
            }
        }
        throw new IllegalArgumentException(wg0.i("Unsupported MIME type: ", str));
    }

    public hxe m() {
        return Z;
    }

    public v83 s() {
        return Y;
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
        if (!gy8.m()) {
            return null;
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
        Long l = null;
        for (int i2 = 0; i2 < i; i2++) {
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
                if (str.equals("timestamp")) {
                    long j = 0;
                    try {
                        j = lz7.M(gy8, 0);
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
                    l = Long.valueOf(j);
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 != 0) {
                            if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        return new egc(l);
    }
}
