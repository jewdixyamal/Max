package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.protocol.HTTP;

/* renamed from: qq9  reason: default package */
public class qq9 implements sq8, nr2, cc3, s43, xk, e46, Provider, df9 {
    public static final v83 X;
    public static final hxe Y = new hxe(new exe(new fxe(-15921907, 336136457, -13786316, -1), new gxe(2047675661, 168364297, -1725062348)), new ixe(new jxe(-1, 336136457, -15921907, -4276546, -11184811, -7566196, -13786316), new kxe(-1191182337, -1191182337, -1545253546, 168364297, -1552517514, -1552517514, -1552517514, -1552517514, -1725062348)), new lxe(new mxe(new nxe(688655884, 252448268))), new oxe(new pxe(-1, -15921907, -2062742259, -13786316), new qxe(-1543503873, -1191182337, -1552517514, -1552517514, -1725062348)));
    public static final i9g Z = new i9g(new h9g(-592138, -1, 336136457, -1), new j9g(-15987188, -7566196, -7566196, -13786316, 1879838220), new k9g(252448268, 252448268, -13786316), new l9g(-15987188, -13786316, 1712066060, -15987188, -1207169524, -2062807540, -2062807540, -13786316));
    public static qq9 a;
    public static final qq9 b = new Object();
    public static final is0 c;
    public static final is0 o;
    public static final qq9 s0 = new Object();
    public static final qq9 t0 = new Object();
    public static final qq9 u0 = new Object();
    public static final qq9 v0 = new Object();

    /* JADX WARNING: type inference failed for: r0v0, types: [qq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [qq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [qq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [qq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [qq9, java.lang.Object] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1557290188, -1557290188, 1714266932);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(523084596, 2990900), new es0(1026401076, 2990900), new fs0(1029346407, 5936231));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-13786316, 338535220, -1, -2060606668);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1294836532, 170763060, 2990900, new int[]{1294836532, -2144492748});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -13786316, 1026401076, 338535220, -1, 338535220, -4112, 338535220, -1, 338535220, 2049811252, new int[]{-1, -1, -1}, new int[]{-1, -1});
        c = new is0(bs0, new js0(-1, -13786316, -16711919, -53188, -13786316, -1305631948, -16711919, -16711919, -9135753, -9135753, -13786316, -871625458, -1895035380, 1879838220, -1895035380), new ks0(-1, 338535220, -13786316, -1), new ls0(new ms0(-1, -13786316, -13786316, -1), -13786316, -13786316, -13786316, -15987188, -2062807540, -2062807540, -1207169524, -13786316, 16777215, -2062807540, -1207169524, -2062807540));
        as0 as03 = r1;
        as0 as04 = new as0(-1728006644, -1728006644, 1711322636);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(523084596, 2990900), new es0(1026401076, 2990900), new fs0(1026401076, 2990900));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-13786316, 523084596, -1, -2060606668);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1294836532, 170763060, 2990900, new int[]{1294836532, -2144492748});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -13786316, 1546494772, 338535220, -1900599, 338535220, 338535220, 523084596, -656897, 338535220, 2063532279, new int[]{-1900599, -1900599, -1900599}, new int[]{-1900599, -1900599});
        o = new is0(bs03, new js0(-1442305, -16741368, -1685946, -16711919, -16741368, -16741368, -16741368, -1, -2063256816, -2063256816, -16711919, -872074480, -1895484656, 1879388944, -1895484656), new ks0(-1900599, 335580168, -16741368, -1), new ls0(new ms0(-1, -13786316, -13786316, -1), -13786316, -13786316, -16711919, -16436464, -2063256816, -2063256816, -1207618800, -16741368, 16777215, -2063256816, -1207618800, -16741368));
        j73 j73 = new j73(new i73(-53188, -15921907, -13786316, -2693121), new k73(-15987188, -4605511, -13786316));
        l73 l73 = r9;
        l73 l732 = new l73(0, 0, 526344, 0, 0, 0, -6236251, -2104376, 1886698102, 0, 0, 0, 0, 0, 0);
        n73 n73 = r31;
        n73 n732 = new n73(-371456, 1039815936, 704271616, -371456, -1543503873, 1024489791, 688945471, -15697601, -2409396, 1037777996, 702233676, -2409396, -16544549, 1023642843, 688098523, -16544549, 1033643952, 698099632, -6543440, -10587743, 1029599649, 694055329, -10587743, 1025203902, 689659582, -14983490, -13786316, 1026401076, 690856756, -13786316, -9158436, 1031028956, 695484636, -9158436);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(1308622847, new int[]{16777215, 1090519039, -2130706433}), new p73(-986638, new int[]{16777215, 1090519039, -2130706433}), new s73(new r73(-2130706433, new int[]{16777215, -1711276033}), new int[]{-2130706433, -1}), new u73(new t73(-986638, new int[]{16777215, -1}), new int[]{-2134193204, 13290444}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1543503873, -520093697, -520093697}, -16769551, -16729857, 47359, -7798611, 8978605, -1, -2130706433);
        X = new v83(j73, new m73(l73, n73, q73, v73, -13786316, 1543503872, -2060621244, -1192234767, -1249810, -1184014, -15921907, 856230153, 336136457, -15921907, 1376521740, -871625204, -1727263220, -9127306, -13786316, -1184014, -5252173, new int[]{-2060621244, -2060621244}, new int[]{-520093697, -520093697}, new int[]{-637534209, -1291845633, -1929379841}, new int[]{-6236251, -2104376}), new w83(-13786316, -13786316, -53188, -2062807794, -13786316, -1), new b93(new c93(251658240, 167772160), new d93(251658240), new e93(251658240)), new j93(new h93(new g93(new f93(-16741368), 520093696), new i93(-1725062348, 168627469, 2047675661)), new k93(new l93(-1545253546, -1725062348)), new m93(new n93(-1543503873, -1191182337, -1545253546, -1552977290, -1725062348))), new o93(new p93(688655630), -1, 1308622847), new q93(-1, -15987188, -1, -53188, -15987698, -2062808050, 1712065550, -13786316));
    }

    public static final u13 a(qq9 qq9, String str) {
        u13 u13 = new u13(str);
        u13.c.put(str, u13);
        return u13;
    }

    public static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.S0 || !(view instanceof gje)) {
            return new RectF((float) view.getLeft(), (float) view.getTop(), (float) view.getRight(), (float) view.getBottom());
        }
        gje gje = (gje) view;
        int contentWidth = gje.getContentWidth();
        int contentHeight = gje.getContentHeight();
        int h = (int) mqd.h(gje.getContext(), 24);
        if (contentWidth < h) {
            contentWidth = h;
        }
        int right = (gje.getRight() + gje.getLeft()) / 2;
        int bottom = (gje.getBottom() + gje.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF((float) (right - i), (float) (bottom - (contentHeight / 2)), (float) (i + right), (float) ((right / 2) + bottom));
    }

    public static b8c e(String str) {
        String i = zr6.i("https://player.vimeo.com/video/", str, "/config");
        String i2 = wg0.i("https://vimeo.com/", str);
        u2a u2a = new u2a();
        l84 l84 = new l84();
        l84.S(i);
        ((bj6) l84.c).h(HTTP.CONTENT_TYPE, "application/json");
        ((bj6) l84.c).h("Referer", i2);
        return u2a.b(l84.r());
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [qq9, java.lang.Object] */
    public static synchronized qq9 j() {
        qq9 qq9;
        synchronized (qq9.class) {
            try {
                if (a == null) {
                    a = new Object();
                }
                qq9 = a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return qq9;
    }

    public static y4c l(int i) {
        Object obj;
        v25 v25 = y4c.z0;
        v25.getClass();
        u1 u1Var = new u1(0, v25);
        while (true) {
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((y4c) obj).ordinal() == i) {
                break;
            }
        }
        return (y4c) obj;
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

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(u4f.class, Executor.class)));
    }

    public is0 g() {
        return c;
    }

    public Object get() {
        return ka0.f;
    }

    public i9g h() {
        return Z;
    }

    public synchronized u13 i(String str) {
        u13 u13;
        try {
            LinkedHashMap linkedHashMap = u13.c;
            u13 = (u13) linkedHashMap.get(str);
            if (u13 == null) {
                u13 = (u13) linkedHashMap.get(eae.o0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : eae.o0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (u13 == null) {
                    u13 = new u13(str);
                }
                linkedHashMap.put(str, u13);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return u13;
    }

    public is0 k() {
        return o;
    }

    public hxe m() {
        return Y;
    }

    public void n(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF b2 = b(tabLayout, view);
        RectF b3 = b(tabLayout, view2);
        drawable.setBounds(og.c((int) b2.left, f, (int) b3.left), drawable.getBounds().top, og.c((int) b2.right, f, (int) b3.right), drawable.getBounds().bottom);
    }

    public Object r(gy8 gy8) {
        return Long.valueOf(lz7.M(gy8, 0));
    }

    public v83 s() {
        return X;
    }

    public gle w(gy8 gy8) {
        int i;
        String str;
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
            return null;
        }
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
                if (str.equals("profile")) {
                    nab C = nd7.C(gy8);
                    if (C != null) {
                        return new ys9(C);
                    }
                    return null;
                }
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
        return null;
    }
}
