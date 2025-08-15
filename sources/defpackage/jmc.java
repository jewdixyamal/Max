package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: jmc  reason: default package */
public final class jmc implements ioe {
    public final jlc a;
    public final o45 b;
    public final khe c = new khe(new lwa(20, this));

    public jmc(jlc jlc, o45 o45) {
        this.a = jlc;
        this.b = o45;
    }

    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r2v93 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r1v106 */
    /* JADX WARNING: type inference failed for: r2v110, types: [q92] */
    /* JADX WARNING: type inference failed for: r2v111, types: [nt2] */
    /* JADX WARNING: type inference failed for: r2v112, types: [l72] */
    /* JADX WARNING: type inference failed for: r2v113, types: [uc2] */
    /* JADX WARNING: type inference failed for: r2v114, types: [n72] */
    /* JADX WARNING: type inference failed for: r2v115, types: [pf9] */
    /* JADX WARNING: type inference failed for: r6v19, types: [rk2] */
    /* JADX WARNING: type inference failed for: r2v116, types: [br2] */
    /* JADX WARNING: type inference failed for: r2v117, types: [nm2] */
    /* JADX WARNING: type inference failed for: r2v118, types: [wg5] */
    /* JADX WARNING: type inference failed for: r2v119, types: [se9] */
    /* JADX WARNING: type inference failed for: r6v20, types: [kf9] */
    /* JADX WARNING: type inference failed for: r2v120, types: [xee] */
    /* JADX WARNING: type inference failed for: r2v121, types: [s8d] */
    /* JADX WARNING: type inference failed for: r14v7, types: [b32] */
    /* JADX WARNING: type inference failed for: r2v122, types: [tr7] */
    /* JADX WARNING: type inference failed for: r2v123, types: [zt] */
    /* JADX WARNING: type inference failed for: r2v124, types: [hu] */
    /* JADX WARNING: type inference failed for: r2v125, types: [ku] */
    /* JADX WARNING: type inference failed for: r2v126, types: [ac2] */
    /* JADX WARNING: type inference failed for: r8v13, types: [hp4] */
    /* JADX WARNING: type inference failed for: r2v127, types: [dp4] */
    /* JADX WARNING: type inference failed for: r2v128, types: [g6f] */
    /* JADX WARNING: type inference failed for: r14v8, types: [s12] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04a7, code lost:
        if (r6.equals("CHAT") == false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:234:0x03f3=Splitter:B:234:0x03f3, B:287:0x04b6=Splitter:B:287:0x04b6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.hua d(defpackage.iua r23, byte[] r24) {
        /*
            r1 = r24
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            int r6 = r23.ordinal()     // Catch:{ ProtoException -> 0x0014 }
            r7 = 0
            switch(r6) {
                case 0: goto L_0x0606;
                case 1: goto L_0x0602;
                case 2: goto L_0x05fd;
                case 3: goto L_0x05f8;
                case 4: goto L_0x05f3;
                case 5: goto L_0x05ee;
                case 6: goto L_0x05c9;
                case 7: goto L_0x05a6;
                case 8: goto L_0x05a1;
                case 9: goto L_0x057c;
                case 10: goto L_0x0548;
                case 11: goto L_0x051e;
                case 12: goto L_0x0516;
                case 13: goto L_0x0510;
                case 14: goto L_0x04ef;
                case 15: goto L_0x04ce;
                case 16: goto L_0x0450;
                case 17: goto L_0x042f;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03af;
                case 20: goto L_0x038e;
                case 21: goto L_0x0369;
                case 22: goto L_0x034b;
                case 23: goto L_0x031c;
                case 24: goto L_0x02ee;
                case 25: goto L_0x029f;
                case 26: goto L_0x027b;
                case 27: goto L_0x025a;
                case 28: goto L_0x0254;
                case 29: goto L_0x0209;
                case 30: goto L_0x0203;
                case 31: goto L_0x01e2;
                case 32: goto L_0x01bc;
                case 33: goto L_0x0195;
                case 34: goto L_0x015f;
                case 35: goto L_0x0135;
                case 36: goto L_0x0115;
                case 37: goto L_0x00d8;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00b0;
                case 40: goto L_0x008a;
                case 41: goto L_0x0064;
                case 42: goto L_0x0018;
                default: goto L_0x000e;
            }     // Catch:{ ProtoException -> 0x0014 }
        L_0x000e:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException     // Catch:{ ProtoException -> 0x0014 }
            r1.<init>()     // Catch:{ ProtoException -> 0x0014 }
            throw r1     // Catch:{ ProtoException -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            r1 = r0
            goto L_0x0607
        L_0x0018:
            ru.ok.tamtam.nano.Tasks$ChangeChatPhoto r2 = new ru.ok.tamtam.nano.Tasks$ChangeChatPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x005c }
            ru.ok.tamtam.nano.Tasks$ChangeChatPhoto r1 = (ru.ok.tamtam.nano.Tasks.ChangeChatPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x005c }
            ru.ok.tamtam.nano.Tasks$Rect r2 = r1.crop     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x0039
            a20 r3 = new a20     // Catch:{ ProtoException -> 0x0014 }
            float r9 = r2.left     // Catch:{ ProtoException -> 0x0014 }
            float r10 = r2.top     // Catch:{ ProtoException -> 0x0014 }
            float r11 = r2.right     // Catch:{ ProtoException -> 0x0014 }
            float r12 = r2.bottom     // Catch:{ ProtoException -> 0x0014 }
            r13 = 2
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r20 = r3
            goto L_0x003b
        L_0x0039:
            r20 = r7
        L_0x003b:
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.file     // Catch:{ ProtoException -> 0x0014 }
            int r5 = r4.length()     // Catch:{ ProtoException -> 0x0014 }
            if (r5 != 0) goto L_0x0048
            r17 = r7
            goto L_0x004a
        L_0x0048:
            r17 = r4
        L_0x004a:
            long r4 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.lastModified     // Catch:{ ProtoException -> 0x0014 }
            s12 r1 = new s12     // Catch:{ ProtoException -> 0x0014 }
            r14 = r1
            r15 = r2
            r18 = r4
            r21 = r6
            r14.<init>(r15, r17, r18, r20, r21)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0059:
            r7 = r1
            goto L_0x0606
        L_0x005c:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0064:
            ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask r2 = new ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0082 }
            ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask r1 = (ru.ok.tamtam.nano.Tasks.UpdateFireTimeProtoTask) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0082 }
            g6f r12 = new g6f     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.fireTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.notifySender     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
        L_0x007f:
            r7 = r12
            goto L_0x0606
        L_0x0082:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x008a:
            ru.ok.tamtam.nano.Tasks$MsgCancelReaction r2 = new ru.ok.tamtam.nano.Tasks$MsgCancelReaction     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x00a8 }
            ru.ok.tamtam.nano.Tasks$MsgCancelReaction r1 = (ru.ok.tamtam.nano.Tasks.MsgCancelReaction) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x00a8 }
            me9 r13 = new me9     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.messageServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r13
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r13
            goto L_0x0606
        L_0x00a8:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x00b0:
            ff9 r7 = defpackage.ef9.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x00b6:
            ru.ok.tamtam.nano.Tasks$DraftDiscard r2 = new ru.ok.tamtam.nano.Tasks$DraftDiscard     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x00d0 }
            ru.ok.tamtam.nano.Tasks$DraftDiscard r1 = (ru.ok.tamtam.nano.Tasks.DraftDiscard) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x00d0 }
            dp4 r9 = new dp4     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.serverTime     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
        L_0x00cd:
            r7 = r9
            goto L_0x0606
        L_0x00d0:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x00d8:
            ru.ok.tamtam.nano.Tasks$DraftSave r2 = new ru.ok.tamtam.nano.Tasks$DraftSave     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x010d }
            ru.ok.tamtam.nano.Tasks$DraftSave r1 = (ru.ok.tamtam.nano.Tasks.DraftSave) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x010d }
            hp4 r2 = new hp4     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            byte[] r1 = r1.draft     // Catch:{ ProtoException -> 0x0014 }
            uaa r1 = defpackage.gp4.a(r1, r7)     // Catch:{ ProtoException -> 0x0014 }
            if (r1 != 0) goto L_0x0105
            uaa r1 = new uaa     // Catch:{ ProtoException -> 0x0014 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r14 = 0
            r16 = 0
            r17 = 0
            r13 = r1
            r13.<init>((long) r14, (defpackage.xd7) r16, (java.lang.Long) r17, (java.lang.Long) r18, (java.lang.Long) r19, (boolean) r20, (int) r21)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0105:
            r13 = r1
            r8 = r2
            r8.<init>(r9, r11, r13)     // Catch:{ ProtoException -> 0x0014 }
        L_0x010a:
            r7 = r2
            goto L_0x0606
        L_0x010d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0115:
            ru.ok.tamtam.nano.Tasks$ChatHide r2 = new ru.ok.tamtam.nano.Tasks$ChatHide     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x012d }
            ru.ok.tamtam.nano.Tasks$ChatHide r1 = (ru.ok.tamtam.nano.Tasks.ChatHide) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x012d }
            ac2 r9 = new ac2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x012d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0135:
            ru.ok.tamtam.nano.Tasks$AssetsMove r2 = new ru.ok.tamtam.nano.Tasks$AssetsMove     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0157 }
            ru.ok.tamtam.nano.Tasks$AssetsMove r1 = (ru.ok.tamtam.nano.Tasks.AssetsMove) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0157 }
            ku r11 = new ku     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r5 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.prevId     // Catch:{ ProtoException -> 0x0014 }
            int r10 = r1.position     // Catch:{ ProtoException -> 0x0014 }
            r2 = r11
            r2.<init>(r3, r5, r6, r8, r10)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0154:
            r7 = r11
            goto L_0x0606
        L_0x0157:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x015f:
            ru.ok.tamtam.nano.Tasks$AssetsRemove r2 = new ru.ok.tamtam.nano.Tasks$AssetsRemove     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x018d }
            ru.ok.tamtam.nano.Tasks$AssetsRemove r1 = (ru.ok.tamtam.nano.Tasks.AssetsRemove) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x018d }
            long[] r2 = r1.ids     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x0178
            int r4 = r2.length     // Catch:{ ProtoException -> 0x0014 }
            if (r4 != 0) goto L_0x0173
            r4 = r5
            goto L_0x0174
        L_0x0173:
            r4 = r3
        L_0x0174:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            long[] r2 = new long[r5]     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            r2[r3] = r4     // Catch:{ ProtoException -> 0x0014 }
        L_0x017e:
            nu r7 = new nu     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r1 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r1 = ru.ok.tamtam.nano.b.b(r1)     // Catch:{ ProtoException -> 0x0014 }
            r7.<init>(r1, r3, r2)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x018d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0195:
            ru.ok.tamtam.nano.Tasks$AssetsListModify r2 = new ru.ok.tamtam.nano.Tasks$AssetsListModify     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01b4 }
            ru.ok.tamtam.nano.Tasks$AssetsListModify r1 = (ru.ok.tamtam.nano.Tasks.AssetsListModify) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01b4 }
            hu r9 = new hu     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r5 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long[] r6 = r1.ids     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.modifyTime     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r6, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x01b4:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x01bc:
            ru.ok.tamtam.nano.Tasks$AssetsAdd r2 = new ru.ok.tamtam.nano.Tasks$AssetsAdd     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01da }
            ru.ok.tamtam.nano.Tasks$AssetsAdd r1 = (ru.ok.tamtam.nano.Tasks.AssetsAdd) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01da }
            zt r8 = new zt     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r3 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r4, r6)     // Catch:{ ProtoException -> 0x0014 }
        L_0x01d7:
            r7 = r8
            goto L_0x0606
        L_0x01da:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x01e2:
            ru.ok.tamtam.nano.Tasks$LocationStop r2 = new ru.ok.tamtam.nano.Tasks$LocationStop     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01fb }
            ru.ok.tamtam.nano.Tasks$LocationStop r1 = (ru.ok.tamtam.nano.Tasks.LocationStop) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01fb }
            tr7 r9 = new tr7     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x01fb:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0203:
            aa5 r7 = defpackage.z95.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0209:
            ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto r2 = new ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x024c }
            ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto r1 = (ru.ok.tamtam.nano.Tasks.ChangeProfileOrChatPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x024c }
            ru.ok.tamtam.nano.Tasks$Rect r2 = r1.crop     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x022a
            a20 r3 = new a20     // Catch:{ ProtoException -> 0x0014 }
            float r9 = r2.left     // Catch:{ ProtoException -> 0x0014 }
            float r10 = r2.top     // Catch:{ ProtoException -> 0x0014 }
            float r11 = r2.right     // Catch:{ ProtoException -> 0x0014 }
            float r12 = r2.bottom     // Catch:{ ProtoException -> 0x0014 }
            r13 = 2
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r20 = r3
            goto L_0x022c
        L_0x022a:
            r20 = r7
        L_0x022c:
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.file     // Catch:{ ProtoException -> 0x0014 }
            int r5 = r4.length()     // Catch:{ ProtoException -> 0x0014 }
            if (r5 != 0) goto L_0x0239
            r17 = r7
            goto L_0x023b
        L_0x0239:
            r17 = r4
        L_0x023b:
            long r4 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.lastModified     // Catch:{ ProtoException -> 0x0014 }
            b32 r1 = new b32     // Catch:{ ProtoException -> 0x0014 }
            r14 = r1
            r15 = r2
            r18 = r4
            r21 = r6
            r14.<init>(r15, r17, r18, r20, r21)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0059
        L_0x024c:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0254:
            q47 r7 = defpackage.p47.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x025a:
            ru.ok.tamtam.nano.Tasks$LocationRequest r2 = new ru.ok.tamtam.nano.Tasks$LocationRequest     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0273 }
            ru.ok.tamtam.nano.Tasks$LocationRequest r1 = (ru.ok.tamtam.nano.Tasks.LocationRequest) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0273 }
            s8d r8 = new s8d     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.liveLocation     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x0273:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x027b:
            ru.ok.tamtam.nano.Tasks$SuspendBot r2 = new ru.ok.tamtam.nano.Tasks$SuspendBot     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0297 }
            ru.ok.tamtam.nano.Tasks$SuspendBot r1 = (ru.ok.tamtam.nano.Tasks.SuspendBot) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0297 }
            xee r10 = new xee     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.botId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.suspend     // Catch:{ ProtoException -> 0x0014 }
            r2 = r10
            r2.<init>(r3, r5, r7, r8)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0294:
            r7 = r10
            goto L_0x0606
        L_0x0297:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x029f:
            ru.ok.tamtam.nano.Tasks$MsgSendCallback r2 = new ru.ok.tamtam.nano.Tasks$MsgSendCallback     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x02e6 }
            ru.ok.tamtam.nano.Tasks$MsgSendCallback r1 = (ru.ok.tamtam.nano.Tasks.MsgSendCallback) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x02e6 }
            kf9 r2 = new kf9     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r9 = r1.callbackId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r10 = r1.payload     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.timestamp     // Catch:{ ProtoException -> 0x0014 }
            long r13 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            kv0 r15 = new kv0     // Catch:{ ProtoException -> 0x0014 }
            ru.ok.tamtam.nano.Tasks$MsgSendCallback$ButtonPosition r4 = r1.buttonPosition     // Catch:{ ProtoException -> 0x0014 }
            int r6 = r4.row     // Catch:{ ProtoException -> 0x0014 }
            int r4 = r4.column     // Catch:{ ProtoException -> 0x0014 }
            r15.<init>(r6, r4)     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r1 = r1.buttonType     // Catch:{ ProtoException -> 0x0014 }
            nv0[] r4 = defpackage.nv0.u0     // Catch:{ ProtoException -> 0x0014 }
            int r6 = r4.length     // Catch:{ ProtoException -> 0x0014 }
        L_0x02c6:
            if (r3 >= r6) goto L_0x02dc
            r5 = r4[r3]     // Catch:{ ProtoException -> 0x0014 }
            r23 = r4
            java.lang.String r4 = r5.a     // Catch:{ ProtoException -> 0x0014 }
            boolean r4 = r4.equalsIgnoreCase(r1)     // Catch:{ ProtoException -> 0x0014 }
            if (r4 == 0) goto L_0x02d7
            r16 = r5
            goto L_0x02e0
        L_0x02d7:
            r5 = 1
            int r3 = r3 + r5
            r4 = r23
            goto L_0x02c6
        L_0x02dc:
            nv0 r1 = defpackage.nv0.UNKNOWN     // Catch:{ ProtoException -> 0x0014 }
            r16 = r1
        L_0x02e0:
            r6 = r2
            r6.<init>(r7, r9, r10, r11, r13, r15, r16)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x010a
        L_0x02e6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x02ee:
            ru.ok.tamtam.nano.Tasks$ChatComplain r2 = new ru.ok.tamtam.nano.Tasks$ChatComplain     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0314 }
            ru.ok.tamtam.nano.Tasks$ChatComplain r1 = (ru.ok.tamtam.nano.Tasks.ChatComplain) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0314 }
            java.lang.String r2 = r1.complaint     // Catch:{ ProtoException -> 0x0014 }
            boolean r2 = defpackage.oag.t(r2)     // Catch:{ ProtoException -> 0x0014 }
            if (r2 != 0) goto L_0x0307
            java.lang.String r2 = r1.complaint     // Catch:{ ProtoException -> 0x0014 }
            da3 r7 = defpackage.da3.a(r2)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0307:
            r13 = r7
            o72 r7 = new o72     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            r8 = r7
            r8.<init>(r9, r11, r13)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0314:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x031c:
            ru.ok.tamtam.nano.Tasks$MsgDeleteRange r2 = new ru.ok.tamtam.nano.Tasks$MsgDeleteRange     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0343 }
            ru.ok.tamtam.nano.Tasks$MsgDeleteRange r1 = (ru.ok.tamtam.nano.Tasks.MsgDeleteRange) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0343 }
            se9 r12 = new se9     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.startTime     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.endTime     // Catch:{ ProtoException -> 0x0014 }
            xxc r2 = defpackage.mg4.o     // Catch:{ ProtoException -> 0x0014 }
            int r1 = r1.itemTypeId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ProtoException -> 0x0014 }
            mg4 r11 = defpackage.xxc.l(r2, r1)     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x0343:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x034b:
            ru.ok.tamtam.nano.Tasks$RemoveContactPhoto r2 = new ru.ok.tamtam.nano.Tasks$RemoveContactPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0361 }
            ru.ok.tamtam.nano.Tasks$RemoveContactPhoto r1 = (ru.ok.tamtam.nano.Tasks.RemoveContactPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0361 }
            bgc r7 = new bgc     // Catch:{ ProtoException -> 0x0014 }
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.photoId     // Catch:{ ProtoException -> 0x0014 }
            r7.<init>(r2, r4)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0361:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0369:
            ru.ok.tamtam.nano.Tasks$FileDownloadCmd r2 = new ru.ok.tamtam.nano.Tasks$FileDownloadCmd     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0386 }
            ru.ok.tamtam.nano.Tasks$FileDownloadCmd r1 = (ru.ok.tamtam.nano.Tasks.FileDownloadCmd) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0386 }
            wg5 r11 = new wg5     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.fileId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.fileName     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.attachLocalId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r9)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0154
        L_0x0386:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x038e:
            ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility r2 = new ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x03a7 }
            ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility r1 = (ru.ok.tamtam.nano.Tasks.ChatPinSetVisibility) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x03a7 }
            nm2 r8 = new nm2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.show     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x03a7:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x03af:
            ru.ok.tamtam.nano.Tasks$ChatSubscribe r2 = new ru.ok.tamtam.nano.Tasks$ChatSubscribe     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x03c8 }
            ru.ok.tamtam.nano.Tasks$ChatSubscribe r1 = (ru.ok.tamtam.nano.Tasks.ChatSubscribe) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x03c8 }
            br2 r8 = new br2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.subscribe     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x03c8:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x03d0:
            ru.ok.tamtam.nano.Tasks$ChatMembersUpdate r2 = new ru.ok.tamtam.nano.Tasks$ChatMembersUpdate     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0427 }
            ru.ok.tamtam.nano.Tasks$ChatMembersUpdate r1 = (ru.ok.tamtam.nano.Tasks.ChatMembersUpdate) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0427 }
            rk2 r2 = new rk2     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.operation     // Catch:{ ProtoException -> 0x0014 }
            r3.getClass()     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r6 = "remove"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x03f2
            r13 = r5
            goto L_0x03f3
        L_0x03f2:
            r13 = r4
        L_0x03f3:
            long[] r3 = r1.userIds     // Catch:{ ProtoException -> 0x0014 }
            java.util.ArrayList r14 = defpackage.nd7.i(r3)     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.chatMemberType     // Catch:{ ProtoException -> 0x0014 }
            r3.getClass()     // Catch:{ ProtoException -> 0x0014 }
            ek2 r4 = defpackage.ek2.MEMBER     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r5 = "BLOCKED_MEMBER"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0416
            java.lang.String r5 = "ADMIN"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0412
            r15 = r4
            goto L_0x0419
        L_0x0412:
            ek2 r3 = defpackage.ek2.ADMIN     // Catch:{ ProtoException -> 0x0014 }
        L_0x0414:
            r15 = r3
            goto L_0x0419
        L_0x0416:
            ek2 r3 = defpackage.ek2.BLOCKED_MEMBER     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0414
        L_0x0419:
            boolean r1 = r1.showHistory     // Catch:{ ProtoException -> 0x0014 }
            r17 = 0
            r18 = 0
            r6 = r2
            r16 = r1
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x010a
        L_0x0427:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x042f:
            ru.ok.tamtam.nano.Tasks$MsgSharePreview r2 = new ru.ok.tamtam.nano.Tasks$MsgSharePreview     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0448 }
            ru.ok.tamtam.nano.Tasks$MsgSharePreview r1 = (ru.ok.tamtam.nano.Tasks.MsgSharePreview) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0448 }
            pf9 r8 = new pf9     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r5 = r1.text     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r6)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x0448:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0450:
            ru.ok.tamtam.nano.Tasks$ChatCreate r6 = new ru.ok.tamtam.nano.Tasks$ChatCreate     // Catch:{ ProtoException -> 0x0014 }
            r6.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r6, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x04c6 }
            ru.ok.tamtam.nano.Tasks$ChatCreate r1 = (ru.ok.tamtam.nano.Tasks.ChatCreate) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x04c6 }
            q82 r17 = new q82     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r6 = r1.chatType     // Catch:{ ProtoException -> 0x0014 }
            boolean r6 = defpackage.oag.t(r6)     // Catch:{ ProtoException -> 0x0014 }
            if (r6 != 0) goto L_0x04b5
            java.lang.String r6 = r1.chatType     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = defpackage.oag.t(r6)     // Catch:{ ProtoException -> 0x0014 }
            if (r11 == 0) goto L_0x0473
        L_0x0471:
            r2 = r5
            goto L_0x04b3
        L_0x0473:
            r6.getClass()     // Catch:{ ProtoException -> 0x0014 }
            r11 = -1
            int r12 = r6.hashCode()
            switch(r12) {
                case 2067288: goto L_0x04a1;
                case 1456933091: goto L_0x0496;
                case 1796630840: goto L_0x048b;
                case 2016211272: goto L_0x0480;
                default: goto L_0x047e;
            }
        L_0x047e:
            r3 = r11
            goto L_0x04aa
        L_0x0480:
            java.lang.String r3 = "DIALOG"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0489
            goto L_0x047e
        L_0x0489:
            r3 = r2
            goto L_0x04aa
        L_0x048b:
            java.lang.String r3 = "GROUP_CHAT"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0494
            goto L_0x047e
        L_0x0494:
            r3 = r4
            goto L_0x04aa
        L_0x0496:
            java.lang.String r3 = "CHANNEL"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x049f
            goto L_0x047e
        L_0x049f:
            r3 = r5
            goto L_0x04aa
        L_0x04a1:
            java.lang.String r12 = "CHAT"
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x04aa
            goto L_0x047e
        L_0x04aa:
            switch(r3) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x04b2;
                case 2: goto L_0x04b0;
                case 3: goto L_0x04ae;
                default: goto L_0x04ad;
            }
        L_0x04ad:
            goto L_0x0471
        L_0x04ae:
            r2 = r4
            goto L_0x04b3
        L_0x04b0:
            r2 = 5
            goto L_0x04b3
        L_0x04b2:
            r2 = 4
        L_0x04b3:
            r11 = r2
            goto L_0x04b6
        L_0x04b5:
            r11 = r3
        L_0x04b6:
            long r12 = r1.groupId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r14 = r1.startPayload     // Catch:{ ProtoException -> 0x0014 }
            long r1 = r1.cid     // Catch:{ ProtoException -> 0x0014 }
            r6 = r17
            r15 = r1
            r6.<init>(r7, r9, r11, r12, r14, r15)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r17
            goto L_0x0606
        L_0x04c6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x04ce:
            ru.ok.tamtam.nano.Tasks$ChatClose r2 = new ru.ok.tamtam.nano.Tasks$ChatClose     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x04e7 }
            ru.ok.tamtam.nano.Tasks$ChatClose r1 = (ru.ok.tamtam.nano.Tasks.ChatClose) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x04e7 }
            n72 r9 = new n72     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x04e7:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x04ef:
            ru.ok.tamtam.nano.Tasks$ChannelLeave r2 = new ru.ok.tamtam.nano.Tasks$ChannelLeave     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0508 }
            ru.ok.tamtam.nano.Tasks$ChannelLeave r1 = (ru.ok.tamtam.nano.Tasks.ChannelLeave) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0508 }
            uc2 r9 = new uc2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x0508:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0510:
            rs2 r7 = defpackage.qs2.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0516:
            java.lang.ref.WeakReference r2 = defpackage.q9d.Z     // Catch:{ ProtoException -> 0x0014 }
            q9d r7 = defpackage.p9d.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x051e:
            ru.ok.tamtam.nano.Tasks$ChatMark r2 = new ru.ok.tamtam.nano.Tasks$ChatMark     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0540 }
            ru.ok.tamtam.nano.Tasks$ChatMark r1 = (ru.ok.tamtam.nano.Tasks.ChatMark) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0540 }
            pd2 r14 = new pd2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.mark     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.setAsUnread     // Catch:{ ProtoException -> 0x0014 }
            boolean r12 = r1.awaitChatInCache     // Catch:{ ProtoException -> 0x0014 }
            boolean r13 = r1.isReadReaction     // Catch:{ ProtoException -> 0x0014 }
            r2 = r14
            r2.<init>(r3, r5, r7, r9, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r14
            goto L_0x0606
        L_0x0540:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0548:
            ru.ok.tamtam.nano.Tasks$VideoPlay r2 = new ru.ok.tamtam.nano.Tasks$VideoPlay     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0574 }
            ru.ok.tamtam.nano.Tasks$VideoPlay r1 = (ru.ok.tamtam.nano.Tasks.VideoPlay) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0574 }
            yjf r18 = new yjf     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.videoId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageServerId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r13 = r1.attachLocalId     // Catch:{ ProtoException -> 0x0014 }
            boolean r14 = r1.startDownload     // Catch:{ ProtoException -> 0x0014 }
            boolean r15 = r1.saveToGallery     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r1 = r1.token     // Catch:{ ProtoException -> 0x0014 }
            r17 = 0
            r2 = r18
            r16 = r1
            r2.<init>(r3, r5, r7, r9, r11, r13, r14, r15, r16, r17)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r18
            goto L_0x0606
        L_0x0574:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x057c:
            ru.ok.tamtam.nano.Tasks$ChatClear r2 = new ru.ok.tamtam.nano.Tasks$ChatClear     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0599 }
            ru.ok.tamtam.nano.Tasks$ChatClear r1 = (ru.ok.tamtam.nano.Tasks.ChatClear) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0599 }
            l72 r12 = new l72     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.lastEventTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.forAll     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x0599:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05a1:
            ve9 r7 = defpackage.ue9.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05a6:
            ru.ok.tamtam.nano.Tasks$ChatsList r2 = new ru.ok.tamtam.nano.Tasks$ChatsList     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x05c1 }
            ru.ok.tamtam.nano.Tasks$ChatsList r1 = (ru.ok.tamtam.nano.Tasks.ChatsList) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x05c1 }
            nt2 r10 = new nt2     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.marker     // Catch:{ ProtoException -> 0x0014 }
            int r3 = r1.count     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.chatsSync     // Catch:{ ProtoException -> 0x0014 }
            r2 = r10
            r2.<init>(r3, r4, r6, r8)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0294
        L_0x05c1:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05c9:
            ru.ok.tamtam.nano.Tasks$ChatDelete r2 = new ru.ok.tamtam.nano.Tasks$ChatDelete     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            qw8 r1 = defpackage.qw8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x05e6 }
            ru.ok.tamtam.nano.Tasks$ChatDelete r1 = (ru.ok.tamtam.nano.Tasks.ChatDelete) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x05e6 }
            q92 r12 = new q92     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.lastEventTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.forAll     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x05e6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05ee:
            de3 r7 = defpackage.de3.v(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05f3:
            sq3 r7 = defpackage.rq3.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05f8:
            sab r7 = defpackage.rab.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05fd:
            jf9 r7 = defpackage.jf9.x(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0602:
            pe9 r7 = defpackage.oe9.a(r24)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0606:
            return r7
        L_0x0607:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jmc.d(iua, byte[]):hua");
    }

    public final void a(long j) {
        hoe b2 = b();
        ilc ilc = b2.a;
        ilc.b();
        zkc zkc = b2.g;
        q36 f = zkc.f();
        f.j(1, j);
        try {
            ilc.c();
            f.n();
            ilc.r();
            ilc.l();
            zkc.t(f);
        } catch (Throwable th) {
            zkc.t(f);
            throw th;
        }
    }

    public final hoe b() {
        return (hoe) this.c.getValue();
    }

    public final List c(ArrayList arrayList) {
        return l6d.i0(l6d.a0(new r1f(new at(2, arrayList), new om8(1, this, jmc.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0, 15)), n71.v0));
    }

    public final une e(long j) {
        vne vne;
        hoe b2 = b();
        b46 b46 = b2.c;
        xlc a2 = xlc.a(1, "SELECT * FROM tasks WHERE id = ?");
        a2.j(1, j);
        ilc ilc = b2.a;
        ilc.b();
        Cursor o = ilc.o(a2, (CancellationSignal) null);
        try {
            int n = tfg.n(o, "id");
            int n2 = tfg.n(o, "type");
            int n3 = tfg.n(o, "status");
            int n4 = tfg.n(o, "fails_count");
            int n5 = tfg.n(o, "depends_request_id");
            int n6 = tfg.n(o, "dependency_type");
            int n7 = tfg.n(o, "data");
            int n8 = tfg.n(o, "created_time");
            if (o.moveToFirst()) {
                long j2 = o.getLong(n);
                int i = o.getInt(n2);
                b46.getClass();
                vne = new vne(j2, b46.t(i), b46.r(o.getInt(n3)), o.getInt(n4), o.getLong(n5), o.getInt(n6), o.isNull(n7) ? null : o.getBlob(n7), o.getLong(n8));
            } else {
                vne = null;
            }
            if (vne != null) {
                return f(vne);
            }
            return null;
        } finally {
            o.close();
            a2.n();
        }
    }

    public final une f(vne vne) {
        hua d = d(vne.b, vne.g);
        if (d == null) {
            ((cba) this.b).c(new Exception("task parse error! " + vne.b), true);
            a(vne.a);
            return null;
        }
        return new une(vne.a, vne.c, vne.d, vne.e, vne.f, d);
    }
}
