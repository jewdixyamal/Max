package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.auth.AUTH;
import org.apache.http.protocol.HTTP;

/* renamed from: pq9  reason: default package */
public final class pq9 implements nr2, cc3, s43, dze, Provider, df9, rpa, pic, kz3 {
    public static final v83 X;
    public static final hxe Y = new hxe(new exe(new fxe(-1, 352321535, -13786316, -14801890), new gxe(1728053247, 184549375, -1725062348)), new ixe(new jxe(-15921907, 352321535, -855638017, -11513776, 1895825407, -8618884, -13786316), new kxe(-1559425779, 2063597567, 1207959551, 184549375, -1548109383, -1548109383, -1548109383, -1548109383, -1725062348)), new lxe(new mxe(new nxe(536870911, 268435455))), new oxe(new pxe(-15921907, -855638017, 1895825407, -13786316), new qxe(-1559425779, 2063597567, -1548109383, -1548109383, -1725062348)));
    public static final i9g Z = new i9g(new h9g(-15198184, -14801890, 401074151, -14801890), new j9g(-855638017, 1895825407, -8618884, -13786316, 1895825407), new k9g(266856423, 15198183, -13786316), new l9g(-1579033, -13786316, 1474815975, -1, -1108875289, -2130706433, -2130706433, -13786316));
    public static pq9 a;
    public static final pq9 b = new Object();
    public static final is0 c;
    public static final is0 o;
    public static final pq9 s0 = new Object();
    public static Context t0;
    public static final pq9 u0 = new Object();
    public static final pq9 v0 = new Object();
    public static final pq9 w0 = new Object();
    public static pq9 x0;

    /* JADX WARNING: type inference failed for: r0v0, types: [pq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [pq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [pq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [pq9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [pq9, java.lang.Object] */
    static {
        as0 as0 = r1;
        as0 as02 = new as0(-1305631948, -1725062348, 1714266932);
        cs0 cs0 = r1;
        cs0 cs02 = new cs0(new ds0(693802087, 5936231), new es0(1029346407, 5936231), new fs0(1381667943, 5936231));
        gs0 gs0 = r1;
        gs0 gs02 = new gs0(-13786316, 704643071, -13786316, 704643071);
        hs0 hs0 = r1;
        hs0 hs02 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs0 = r1;
        bs0 bs02 = new bs0(as0, cs0, gs0, hs0, -3158065, -2133864497, 536870911, -14734048, 704643071, 704643071, 536870911, 704643071, 536870911, 1728053247, new int[]{-14931677, -14931677, -14931677}, new int[]{-14931677, -14931677});
        c = new is0(bs0, new js0(-14470357, -1191182337, -16711919, -36771, -1543503873, -1543503873, -16711919, -16711919, -2130706433, -2130706433, -1, -855638017, -1543503873, 1895825407, -855638017), new ks0(-14470357, 352321535, 1728053247, -1), new ls0(new ms0(-1, -520093697, -1, -520093697), -13786316, -520093697, -1, -520093697, -2046820353, -2130706433, -1107296257, -1, -1, -2130706433, -520093697, -2130706433));
        as0 as03 = r1;
        as0 as04 = new as0(-1722117017, -1722117017, 1717212263);
        cs0 cs03 = r1;
        cs0 cs04 = new cs0(new ds0(704643071, 16777215), new es0(1029346407, 5936231), new fs0(1381667943, 5936231));
        gs0 gs03 = r1;
        gs0 gs04 = new gs0(-1, 704643071, -13786316, 704643071);
        hs0 hs03 = r1;
        hs0 hs04 = new hs0(1308622847, 184549375, 16777215, new int[]{234881023, 872415231});
        bs0 bs03 = r1;
        bs0 bs04 = new bs0(as03, cs03, gs03, hs03, -520093697, -2130706433, 704643071, -14393816, 704643071, 704643071, 704643071, 1040187391, 536870911, 1728053247, new int[]{-15115975, -15249357, -15448274}, new int[]{-15448274, -15115975});
        o = new is0(bs03, new js0(-15381968, -520093697, -1685946, -16711919, -520093697, -520093697, -520093697, -520093697, -2130706433, -2130706433, -16711919, -855638017, -1543503873, 1895825407, -855638017), new ks0(-15381968, 452984831, -2046820353, -1), new ls0(new ms0(-15115975, -520093697, -1, -520093697), -520093697, -1191182337, -16711919, -520093697, -2130706433, -2130706433, -520093697, -1, -1, -2130706433, -520093697, -1543503873));
        j73 j73 = new j73(new i73(-48049, -1579033, -13786316, -5058310), new k73(-1, 1895825407, -13786316));
        l73 l73 = r9;
        l73 l732 = new l73(0, 0, 0, 0, 0, 0, -15986931, -15986931, 1378180151, 0, 0, 0, 0, 0, 0);
        n73 n73 = r31;
        n73 n732 = new n73(-2405632, 721429580, 1305464783, -1, 1946157055, 721429580, 1305464783, -1, -4703924, 721429580, 1305464783, -1, -15166245, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13290047, 721429580, 1305464783, -1, 721429580, 1305464783, -1, -13786316, 721439744, 1305464783, -1, -10669092, 721429580, 1305464783, -1);
        q73 q73 = r1;
        q73 q732 = new q73(new o73(452984831, new int[]{16777215, 285212671, 553648127}), new p73(452984831, new int[]{16777215, 285212671, 553648127}), new s73(new r73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}), new u73(new t73(704643071, new int[]{16777215, 704643071}), new int[]{872415231, -2130706433}));
        v73 v73 = r12;
        v73 v732 = new v73(new int[]{-1558435549, -535025373, -535025373}, -1, 16777215, 16777215, 16777215, 16777215, 872415231, 452984831);
        X = new v83(j73, new m73(l73, n73, q73, v73, -13786316, 1929379840, -1305786566, -868325805, -12687789, -15263716, -1, 536870911, 402653183, -13786316, -1559491060, -871625204, -1727263220, -2145035209, -13786316, -12500154, -15986931, new int[]{-1305786566, -1305786566}, new int[]{-13940934, -13940934}, new int[]{-650221997, -1304533421, -1942067629}, new int[]{-15986931, -15986931}), new w83(-13786316, -520093697, -3259817, -2130706433, -13786316, -855638017), new b93(new c93(855638016, 637534208), new d93(687865856), new e93(687865856)), new j93(new h93(new g93(new f93(-16741368), 536870911), new i93(-1725062348, 184549375, 1728053247)), new k93(new l93(1207959551, -1725062348)), new m93(new n93(1207959551, 2063597567, 1207959551, -1548240711, -1725062348))), new o93(new p93(536870911), -855638017, 1883137619), new q93(-855638017, -855638017, -15987188, -3259817, -520093697, 1895825407, 1207959551, -13786316));
    }

    public static final yic a(yic yic) {
        if ((yic != null ? yic.Z : null) == null) {
            return yic;
        }
        xic n = yic.n();
        n.g = null;
        return n.a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [pq9, java.lang.Object] */
    public static pq9 q() {
        if (x0 == null) {
            x0 = new Object();
        }
        return x0;
    }

    public static boolean t(String str) {
        return !HTTP.CONN_DIRECTIVE.equalsIgnoreCase(str) && !HTTP.CONN_KEEP_ALIVE.equalsIgnoreCase(str) && !AUTH.PROXY_AUTH.equalsIgnoreCase(str) && !AUTH.PROXY_AUTH_RESP.equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !HTTP.TRANSFER_ENCODING.equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static long u() {
        return TimeUnit.NANOSECONDS.toMicros(System.nanoTime());
    }

    public qp4 b(Context context) {
        if (qp4.v0 == null) {
            synchronized (this) {
                if (qp4.v0 == null) {
                    qp4.v0 = new qp4(context);
                }
            }
        }
        return qp4.v0;
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

    public void e(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public Object f(bg4 bg4) {
        return nd7.s((Executor) bg4.f(new lqb(u4f.class, Executor.class)));
    }

    public is0 g() {
        return c;
    }

    public Object get() {
        return Integer.valueOf(puc.o);
    }

    public i9g h() {
        return Z;
    }

    public Object i() {
        throw new RuntimeException("No update");
    }

    public fka j(View view) {
        return b(view.getContext()).i();
    }

    public is0 k() {
        return o;
    }

    public boolean l() {
        return false;
    }

    public hxe m() {
        return Y;
    }

    public Object n() {
        return null;
    }

    public sba o(Context context) {
        return b(context).g();
    }

    public sba p(View view) {
        return b(view.getContext()).g();
    }

    public Object r(gy8 gy8) {
        return lz7.P(gy8);
    }

    public v83 s() {
        return X;
    }

    /* JADX WARNING: type inference failed for: r9v5, types: [df9, java.lang.Object] */
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
        Set set = wz4.a;
        boolean z = false;
        f52 f52 = null;
        Set set2 = set;
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
                int hashCode = str.hashCode();
                if (hashCode != -1690743503) {
                    if (hashCode != 115180) {
                        if (hashCode == 3052376 && str.equals("chat")) {
                            try {
                                f52 = f52.a(gy8);
                            } catch (Throwable th3) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th3);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    f52 = null;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th3;
                                }
                            }
                        }
                    } else if (str.equals("ttl")) {
                        try {
                            z = lz7.H(gy8);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                z = false;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("messageIds")) {
                    try {
                        set2 = lz7.X(gy8, new Object());
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            set2 = set;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th6) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th6);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        if (f52 == null) {
            return null;
        }
        return new qs9(f52, set2, z);
    }
}
