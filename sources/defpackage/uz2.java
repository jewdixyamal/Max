package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: uz2  reason: default package */
public final class uz2 {
    public final jp4 a;

    public uz2(jp4 jp4) {
        this.a = jp4;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [vd7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.Object, k10] */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.lang.Object, s82] */
    /* JADX WARNING: type inference failed for: r10v17, types: [s7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v36, types: [java.lang.Object, a92] */
    public final k92 a(byte[] bArr) {
        j92 j92;
        ArrayList arrayList;
        ArrayList arrayList2;
        Map<Long, Protos.Chat.AdminParticipant> map;
        int i = 2;
        byte[] bArr2 = b.a;
        try {
            Protos.Chat chat = (Protos.Chat) qw8.mergeFrom(new Protos.Chat(), bArr);
            u82 u82 = new u82();
            u82.a = chat.serverId;
            int i2 = chat.type;
            if (i2 != 0) {
                j92 = j92.b;
                if (i2 != 1) {
                    if (i2 == 2) {
                        j92 = j92.c;
                    } else if (i2 == 3) {
                        j92 = j92.o;
                    }
                }
            } else {
                j92 = j92.a;
            }
            u82.b = j92;
            int i3 = chat.status;
            i92 i92 = i92.a;
            switch (i3) {
                case 1:
                    i92 = i92.b;
                    break;
                case 2:
                    i92 = i92.c;
                    break;
                case 3:
                    i92 = i92.o;
                    break;
                case 4:
                    i92 = i92.X;
                    break;
                case 5:
                    i92 = i92.Y;
                    break;
                case 6:
                    i92 = i92.Z;
                    break;
            }
            u82.c = i92;
            u82.d = chat.owner;
            u82.e = chat.participants;
            u82.f = chat.created;
            u82.g = chat.title;
            u82.h = chat.baseIconUrl;
            u82.i = chat.baseRawIconUrl;
            u82.j = chat.lastMessageId;
            u82.k = chat.lastEventTime;
            u82.P = chat.joinTime;
            u82.l = chat.cid;
            u82.m = chat.newMessages;
            u82.l0 = chat.markedAsUnread;
            Protos.Chat.Chunk[] chunkArr = chat.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                for (Protos.Chat.Chunk i4 : chunkArr) {
                    u82.n.a(b.i(i4), mg4.REGULAR);
                }
            }
            Protos.Chat.Chunk[] chunkArr2 = chat.delayedChunk;
            if (chunkArr2 != null && chunkArr2.length > 0) {
                for (Protos.Chat.Chunk i5 : chunkArr2) {
                    u82.n.a(b.i(i5), mg4.DELAYED);
                }
            }
            u82.o = chat.lastInput;
            Protos.Chat.ChatSettings chatSettings = chat.chatSettings;
            if (chatSettings != null) {
                ? obj = new Object();
                obj.c = chatSettings.lastNotifMark;
                obj.d = chatSettings.lastNotifMessageId;
                obj.a = chatSettings.dontDisturbUntil;
                int[] iArr = chatSettings.options;
                if (iArr != null && iArr.length > 0) {
                    for (int i6 : iArr) {
                        if (i6 == 0) {
                            obj.a(y82.a);
                        } else if (i6 == 1) {
                            obj.a(y82.b);
                        } else if (i6 == 2) {
                            obj.a(y82.c);
                        }
                    }
                }
                obj.e = chatSettings.favoriteIndex;
                obj.f = chatSettings.hideMyLiveLocationPanelBeforeTime;
                obj.g = chatSettings.hideLiveLocationPanelBeforeTime;
                u82.p = new b92(obj);
            }
            Protos.Chat.ChatMedia chatMedia = chat.mediaAll;
            if (chatMedia != null) {
                u82.q = b.g(chatMedia);
            }
            Protos.Chat.ChatMedia chatMedia2 = chat.mediaPhotoVideo;
            if (chatMedia2 != null) {
                u82.r = b.g(chatMedia2);
            }
            Protos.Chat.ChatMedia chatMedia3 = chat.mediaMusic;
            if (chatMedia3 != null) {
                u82.t = b.g(chatMedia3);
            }
            Protos.Chat.ChatMedia chatMedia4 = chat.mediaAudio;
            if (chatMedia4 != null) {
                u82.u = b.g(chatMedia4);
            }
            Protos.Chat.ChatMedia chatMedia5 = chat.mediaFiles;
            if (chatMedia5 != null) {
                u82.v = b.g(chatMedia5);
            }
            Protos.Chat.ChatMedia chatMedia6 = chat.mediaLocations;
            if (chatMedia6 != null) {
                u82.w = b.g(chatMedia6);
            }
            Protos.Chat.ChatMedia chatMedia7 = chat.mediaShare;
            if (chatMedia7 != null) {
                u82.s = b.g(chatMedia7);
            }
            u82.x = chat.firstMessageId;
            Protos.Chat.Section[] sectionArr = chat.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                for (Protos.Chat.Section section : sectionArr) {
                    ? obj2 = new Object();
                    obj2.c = section.id;
                    obj2.d = section.title;
                    long[] jArr = section.stickers;
                    if (jArr != null) {
                        obj2.e = nd7.i(jArr);
                    }
                    obj2.a = section.marker;
                    obj2.b = section.collapsed;
                    h92 h92 = new h92(obj2);
                    if (u82.y == null) {
                        u82.y = new ArrayList();
                    }
                    u82.y.add(h92);
                }
            }
            String[] strArr = chat.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                u82.z = Arrays.asList(strArr);
            }
            u82.A = chat.stickersSyncTime;
            int[] iArr2 = chat.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                for (int i7 : iArr2) {
                    if (i7 == 0) {
                        u82.a(v82.a);
                    } else if (i7 == 1) {
                        u82.a(v82.b);
                    } else if (i7 == 2) {
                        u82.a(v82.c);
                    } else if (i7 == 3) {
                        u82.a(v82.o);
                    }
                }
            }
            Protos.Chat.ChatSubject chatSubject = chat.chatSubject;
            if (chatSubject != null) {
                long[] jArr2 = chatSubject.organizationIds;
                if (jArr2.length > 0) {
                    u82.D = new c92(jArr2);
                }
            }
            Protos.Chat.ChannelInfo channelInfo = chat.channelInfo;
            if (channelInfo != null) {
                chat.participantsCount = channelInfo.membersCount;
                chat.description = channelInfo.description;
                chat.admins = channelInfo.admins;
                if (channelInfo.signAdmin) {
                    Protos.Chat.ChatOptions chatOptions = new Protos.Chat.ChatOptions();
                    chatOptions.signAdmin = true;
                    chat.chatOptions = chatOptions;
                }
            }
            if (chat.participantsCount == 0 && u82.d().size() > 0) {
                chat.participantsCount = u82.d().size();
            }
            u82.G = chat.participantsCount;
            u82.H = chat.description;
            u82.I = nd7.i(chat.admins);
            long[] jArr3 = chat.admins;
            if (jArr3 == null || ((map = chat.adminParticipants) != null && jArr3.length <= map.size())) {
                u82.e(b.a(chat.adminParticipants));
            } else {
                HashMap hashMap = new HashMap();
                Map<Long, Protos.Chat.AdminParticipant> map2 = chat.adminParticipants;
                if (map2 != null) {
                    hashMap.putAll(b.a(map2));
                }
                for (long j : chat.admins) {
                    if (!hashMap.containsKey(Long.valueOf(j))) {
                        Long valueOf = Long.valueOf(j);
                        ? obj3 = new Object();
                        obj3.b = j;
                        obj3.a = 2043;
                        hashMap.put(valueOf, new t82(obj3));
                    }
                }
                u82.e(hashMap);
            }
            u82.J = chat.blockedParticipantsCount;
            Protos.Chat.ChatOptions chatOptions2 = chat.chatOptions;
            if (chatOptions2 != null) {
                if (u82.K == null) {
                    u82.K = z82.j;
                }
                boolean z = u82.K.a;
                z82 z82 = r8;
                z82 z822 = new z82(chatOptions2.signAdmin, chatOptions2.onlyOwnerCanChangeIconTitle, chatOptions2.official, chatOptions2.onlyAdminCanAddMember, chatOptions2.allCanPinMessage, chatOptions2.onlyAdminCanCall, chatOptions2.sentByPhone, chatOptions2.serviceChat, chatOptions2.membersCanSeePrivateLink);
                u82.K = z82;
            }
            int i8 = chat.accessType;
            if (i8 == 0) {
                u82.r0 = 1;
            } else if (i8 == 1) {
                u82.r0 = 2;
            }
            u82.E = chat.link;
            u82.F = new fm5(chat.restrictions, 2);
            Protos.Chat.GroupChatInfo groupChatInfo = chat.groupChatInfo;
            if (groupChatInfo != null) {
                eh6 eh6 = eh6.b;
                long j2 = groupChatInfo.groupId;
                boolean z2 = groupChatInfo.isAnswered;
                boolean z3 = groupChatInfo.isModerator;
                boolean z4 = groupChatInfo.isImportant;
                String str = groupChatInfo.name;
                String str2 = groupChatInfo.baseIconUrl;
                boolean z5 = groupChatInfo.isCustomTitle;
                boolean z6 = groupChatInfo.isMember;
                Protos.Chat.GroupChatInfo.GroupOptions groupOptions = groupChatInfo.groupOptions;
                if (groupOptions != null) {
                    eh6 = new eh6(groupOptions.groupPremium);
                }
                eh6 eh62 = eh6;
                int i9 = groupChatInfo.messagingPermissions;
                u82.C = new f92(j2, z2, z3, z4, str, str2, z5, z6, i9 != 1 ? i9 != 2 ? 1 : 3 : 2, eh62);
            }
            u82.L = chat.pinnedMessageId;
            u82.M = chat.hidePinnedMessage;
            u82.N = chat.unreadReply;
            u82.O = chat.unreadPin;
            u82.Q = chat.messagesTtlSec;
            u82.S = chat.flagsSettings;
            Protos.Chat.VideoConversation videoConversation = chat.videoConversation;
            if (videoConversation != null) {
                long[] jArr4 = videoConversation.previewParticipantIds;
                if (jArr4 != null) {
                    arrayList2 = new ArrayList(jArr4.length);
                    for (long valueOf2 : jArr4) {
                        arrayList2.add(Long.valueOf(valueOf2));
                    }
                } else {
                    arrayList2 = null;
                }
                Protos.Chat.VideoConversation videoConversation2 = chat.videoConversation;
                int i10 = videoConversation2.type;
                if (i10 != 1) {
                    i = i10 != 2 ? 1 : 3;
                }
                ? obj4 = new Object();
                obj4.a = videoConversation2.conversationId;
                obj4.b = videoConversation2.startedAt;
                obj4.c = videoConversation2.joinLink;
                obj4.d = videoConversation2.approxParticipantCount;
                obj4.e = arrayList2;
                obj4.f = i;
                u82.T = new k10(obj4);
            }
            u82.U = chat.lastOpenPositionTime;
            u82.V = chat.lastOpenPositionOffset;
            u82.W = chat.lastOpenReadMark;
            u82.X = (int) chat.lastOpenNewMessages;
            u82.Y = chat.lastSearchClickTime;
            u82.Z = chat.lastWriteTime;
            Protos.Chat.LastInputMedia[] lastInputMediaArr = chat.lastInputMedia;
            if (lastInputMediaArr != null) {
                ArrayList arrayList3 = new ArrayList(lastInputMediaArr.length);
                for (Protos.Chat.LastInputMedia lastInputMedia : lastInputMediaArr) {
                    ? obj5 = new Object();
                    obj5.a = lastInputMedia.originalId;
                    obj5.b = lastInputMedia.originalUri;
                    obj5.c = lastInputMedia.thumbnailUri;
                    obj5.d = lastInputMedia.originalOrientation;
                    obj5.e = lastInputMedia.originalDuration;
                    obj5.f = lastInputMedia.mimeType;
                    obj5.g = lastInputMedia.dateModified;
                    obj5.h = lastInputMedia.editedUri;
                    obj5.k = lastInputMedia.attachLocalId;
                    obj5.i = lastInputMedia.type;
                    int[] iArr3 = lastInputMedia.wave;
                    if (iArr3 == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (int valueOf3 : iArr3) {
                            arrayList.add(Integer.valueOf(valueOf3));
                        }
                    }
                    obj5.j = arrayList;
                    arrayList3.add(new wd7(obj5));
                }
                u82.a0 = arrayList3;
            }
            u82.b0 = chat.lastInputEditMessageId;
            u82.c0 = chat.lastInputReplyMessageId;
            u82.f0 = this.a.e(chat.draft);
            u82.g0 = chat.draftUpdateTime;
            u82.h0 = chat.draftUpdateTimeForSyncLogic;
            Protos.Chat.BotsInfo botsInfo = chat.botsInfo;
            u82.d0 = botsInfo == null ? oq0.c : new oq0(botsInfo.hasBots, botsInfo.suspendedBot);
            u82.e0 = chat.modified;
            u82.j0 = chat.liveLocationMessageIds;
            u82.i0 = chat.subscribedToUpdates;
            u82.k0 = chat.lastMentionMessageId;
            u82.n0 = chat.lastReactedMessageId;
            String str3 = chat.lastReaction;
            if (oag.t(str3)) {
                u82.o0 = null;
            } else {
                u82.o0 = str3;
            }
            Protos.Chat.PushMessage pushMessage = chat.lastPushMessage;
            if (pushMessage != null) {
                u82.m0 = new g92(pushMessage.time, pushMessage.text, pushMessage.id);
            }
            u82.q0 = chat.lastFireDelayedErrorTime;
            u82.p0 = chat.lastDelayedUpdateTime;
            return new k92(u82);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
