package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tq2  reason: default package */
public final class tq2 extends dle {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tq2(sla sla, int i) {
        super(sla);
        this.o = i;
    }

    public short N() {
        switch (this.o) {
            case 0:
                return sla.CHAT_SEARCH_COMMON_PARTICIPANTS.a;
            case 1:
                yb9 yb9 = sla.c;
                return 75;
            case 2:
                yb9 yb92 = sla.c;
                return 55;
            case 3:
                yb9 yb93 = sla.c;
                return 53;
            case 4:
                yb9 yb94 = sla.c;
                return 22;
            case 7:
                yb9 yb95 = sla.c;
                return 36;
            case 8:
                yb9 yb96 = sla.c;
                return 39;
            case 9:
                yb9 yb97 = sla.c;
                return 35;
            case 10:
                yb9 yb98 = sla.c;
                return 34;
            case 11:
                return sla.DRAFT_DISCARD.a;
            case Protos.Attaches.Attach.PRESENT:
                return sla.DRAFT_SAVE.a;
            case Protos.Attaches.Attach.LOCATION:
                yb9 yb99 = sla.c;
                return 88;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                yb9 yb910 = sla.c;
                return 87;
            case 16:
                yb9 yb911 = sla.c;
                return 124;
            case LangUtils.HASH_SEED:
                yb9 yb912 = sla.c;
                return 179;
            case 21:
                yb9 yb913 = sla.c;
                return 71;
            case 22:
                yb9 yb914 = sla.c;
                return 181;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                yb9 yb915 = sla.c;
                return 178;
            case 25:
                yb9 yb916 = sla.c;
                return 73;
            case 26:
                yb9 yb917 = sla.c;
                return 72;
            case 27:
                yb9 yb918 = sla.c;
                return 118;
            case 29:
                yb9 yb919 = sla.c;
                return 70;
            default:
                return super.N();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2() {
        super((sla) null);
        this.o = 15;
        e(1, NewHtcHomeBadger.COUNT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i) {
        super((sla) null);
        this.o = 8;
        i(j, "contactId");
        e(50, NewHtcHomeBadger.COUNT);
        if (i != 0) {
            e(i, "from");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i, byte b) {
        super((sla) null);
        this.o = i;
        switch (i) {
            case 26:
                super((sla) null);
                if (j != 0) {
                    i(j, ApiProtocol.PARAM_CHAT_ID);
                    return;
                }
                return;
            default:
                i(j, "fileId");
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, int i, String str, boolean z, String str2, HashMap hashMap, String str3, String str4, a20 a20, Long l, boolean z2, long j2) {
        super((sla) null);
        String str5;
        this.o = 2;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        if (i != 0) {
            if (i == 1) {
                str5 = "UNKNOWN";
            } else if (i == 2) {
                str5 = "PUBLIC";
            } else if (i == 3) {
                str5 = "PRIVATE";
            } else {
                throw null;
            }
            p("access", str5);
        }
        if (!oag.t(str)) {
            p("link", str);
        }
        if (z) {
            d("revokePrivateLink", true);
        }
        if (str2 != null) {
            p("description", str2);
        }
        if (hashMap != null && hashMap.size() > 0) {
            n("options", hashMap);
        }
        if (str3 != null) {
            p("theme", str3);
        }
        if (str4 != null) {
            p("photoToken", str4);
        }
        if (a20 != null) {
            n("crop", a20.a());
        }
        if (l != null) {
            ((HashMap) this.b).put("pinMessageId", l);
            if (z2) {
                d("notifyPin", true);
            }
        }
        if (j2 != 0) {
            i(j2, "changeOwnerId");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, List list) {
        super((sla) null);
        this.o = 21;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        g("messageIds", list);
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [qpd, java.util.Map] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(String str, long j, le3 le3, boolean z) {
        super((sla) null);
        this.o = 4;
        Map map = null;
        if (!oag.t(str)) {
            p("pushToken", str);
        }
        if (j > 0) {
            i(j, "pushOptions");
        }
        if (le3 != null) {
            ? qpd = new qpd(4);
            String str2 = le3.a;
            if (str2 != null) {
                qpd.put("hash", str2);
            }
            Map map2 = le3.c;
            if (map2 != null) {
                map = map2.isEmpty() ^ true ? map2 : map;
                if (map != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mz7.Z(map.size()));
                    for (Map.Entry entry : map.entrySet()) {
                        Object key = entry.getKey();
                        xq2 xq2 = (xq2) entry.getValue();
                        xq2.getClass();
                        qpd qpd2 = new qpd(0);
                        qpd2.put("dontDisturbUntil", Long.valueOf(xq2.b));
                        Long l = xq2.c;
                        if (l != null) {
                            qpd2.put("favIndex", l);
                        }
                        List list = xq2.a;
                        if (list == null || list.isEmpty()) {
                            Boolean bool = Boolean.FALSE;
                            qpd2.put("sound", bool);
                            qpd2.put("vibr", bool);
                            qpd2.put("led", bool);
                        } else {
                            qpd2.put("sound", Boolean.valueOf(list.contains(jm2.SOUND)));
                            qpd2.put("vibr", Boolean.valueOf(list.contains(jm2.VIBRATION)));
                            qpd2.put("led", Boolean.valueOf(list.contains(jm2.LED)));
                        }
                        linkedHashMap.put(key, qpd2);
                    }
                    qpd.put("chats", linkedHashMap);
                }
            }
            gaf gaf = le3.d;
            if (gaf != null) {
                qpd qpd3 = new qpd(0);
                Boolean bool2 = gaf.a;
                if (bool2 != null) {
                    qpd3.put("PUSH_NEW_CONTACTS", bool2);
                }
                Long l2 = gaf.b;
                if (l2 != null) {
                    qpd3.put("DONT_DISTURB_UNTIL", l2);
                }
                String str3 = gaf.c;
                if (str3 != null) {
                    qpd3.put("DIALOGS_PUSH_NOTIFICATION", str3);
                }
                String str4 = gaf.d;
                if (str4 != null) {
                    qpd3.put("CHATS_PUSH_NOTIFICATION", str4);
                }
                String str5 = gaf.e;
                if (str5 != null) {
                    qpd3.put("PUSH_SOUND", str5);
                }
                String str6 = gaf.f;
                if (str6 != null) {
                    qpd3.put("DIALOGS_PUSH_SOUND", str6);
                }
                String str7 = gaf.g;
                if (str7 != null) {
                    qpd3.put("CHATS_PUSH_SOUND", str7);
                }
                Boolean bool3 = gaf.h;
                if (bool3 != null) {
                    qpd3.put("HIDDEN", bool3);
                }
                Integer num = gaf.i;
                if (num != null) {
                    qpd3.put("LED", num);
                }
                Integer num2 = gaf.j;
                if (num2 != null) {
                    qpd3.put("DIALOGS_LED", num2);
                }
                Integer num3 = gaf.k;
                if (num3 != null) {
                    qpd3.put("CHATS_LED", num3);
                }
                Boolean bool4 = gaf.l;
                if (bool4 != null) {
                    qpd3.put("VIBR", bool4);
                }
                Boolean bool5 = gaf.m;
                if (bool5 != null) {
                    qpd3.put("DIALOGS_VIBR", bool5);
                }
                Boolean bool6 = gaf.n;
                if (bool6 != null) {
                    qpd3.put("CHATS_VIBR", bool6);
                }
                int i = gaf.p;
                if (i != 0) {
                    qpd3.put("INCOMING_CALL", h4f.k(i));
                }
                int i2 = gaf.o;
                if (i2 != 0) {
                    qpd3.put("CHATS_INVITE", h4f.k(i2));
                }
                faf faf = gaf.q;
                if (faf != null) {
                    qpd3.put("INACTIVE_TTL", faf.a);
                }
                int i3 = gaf.r;
                if (i3 != 0) {
                    qpd3.put("M_CALL_PUSH_NOTIFICATION", h4f.j(i3));
                }
                int i4 = gaf.s;
                if (i4 != 0) {
                    qpd3.put("SUGGEST_STICKERS", h4f.l(i4));
                }
                Boolean bool7 = gaf.t;
                if (bool7 != null) {
                    qpd3.put("AUDIO_TRANSCRIPTION_ENABLED", bool7);
                }
                Boolean bool8 = gaf.u;
                if (bool8 != null) {
                    qpd3.put("SAFE_MODE", bool8);
                }
                int i5 = gaf.v;
                if (i5 != 0) {
                    qpd3.put("SEARCH_BY_PHONE", h4f.k(i5));
                }
                Boolean bool9 = gaf.w;
                if (bool9 != null) {
                    qpd3.put("UNSAFE_FILES", bool9);
                }
                qpd.put("user", qpd3);
            }
            sa2 sa2 = le3.e;
            if (sa2 != null) {
                qpd.put("chatFolders", br7.f(new kpa("ALL_FILTER_EXCLUDE", x53.D0(sa2.a)), new kpa("FOLDERS", x53.D0(sa2.b))));
            }
            n("settings", qpd);
        }
        if (z) {
            d("reset", z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, long j2, String str, wz wzVar, ArrayList arrayList, ng4 ng4) {
        super(sla.MSG_EDIT);
        this.o = 20;
        i(j, ApiProtocol.PARAM_CHAT_ID);
        i(j2, "messageId");
        if (str != null) {
            p("text", str);
        }
        if (wzVar != null) {
            g("attachments", wzVar);
        }
        if (arrayList != null) {
            g("elements", arrayList);
        }
        if (ng4 != null) {
            n("delayedAttributes", ng4.a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long[] jArr) {
        super(sla.CONTACT_INFO);
        this.o = 6;
        h("contactIds", jArr);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tq2(long j, long j2, lna lna, Boolean bool, long j3) {
        super(sla.MSG_SEND);
        this.o = 28;
        if (j != 0) {
            i(j, ApiProtocol.PARAM_CHAT_ID);
        }
        if (j2 != 0) {
            i(j2, "userId");
        }
        n("message", lna.a());
        if (bool != null) {
            ((HashMap) this.b).put("notify", bool);
        }
        if (j3 != 0) {
            i(j3, "lastKnownDraftTime");
        }
    }
}
