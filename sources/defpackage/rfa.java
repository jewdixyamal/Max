package defpackage;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* renamed from: rfa  reason: default package */
public final class rfa extends oy {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ ilc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfa(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 5);
        this.o = workDatabase_Impl;
    }

    private final yx8 v(k36 k36) {
        k36 k362 = k36;
        HashMap hashMap = new HashMap(13);
        hashMap.put("attach_local_id", new ije(0, 1, "attach_local_id", "TEXT", (String) null, false));
        hashMap.put("prepared_path", new ije(0, 1, "prepared_path", "TEXT", (String) null, false));
        hashMap.put("file_name", new ije(0, 1, "file_name", "TEXT", (String) null, false));
        hashMap.put("upload_url", new ije(0, 1, "upload_url", "TEXT", (String) null, false));
        hashMap.put("upload_progress", new ije(0, 1, "upload_progress", "REAL", (String) null, true));
        hashMap.put("total_bytes", new ije(0, 1, "total_bytes", "INTEGER", (String) null, true));
        hashMap.put("upload_status", new ije(0, 1, "upload_status", "INTEGER", (String) null, false));
        hashMap.put("created_time", new ije(0, 1, "created_time", "INTEGER", (String) null, true));
        hashMap.put(ClientCookie.PATH_ATTR, new ije(1, 1, ClientCookie.PATH_ATTR, "TEXT", (String) null, true));
        hashMap.put("last_modified", new ije(2, 1, "last_modified", "INTEGER", (String) null, true));
        hashMap.put("upload_type", new ije(3, 1, "upload_type", "INTEGER", (String) null, true));
        hashMap.put("photo_token", new ije(0, 1, "photo_token", "TEXT", (String) null, false));
        mje mje = new mje("uploads", hashMap, h4f.o(hashMap, "attach_id", new ije(0, 1, "attach_id", "INTEGER", (String) null, false), 0), new HashSet(0));
        mje a = mje.a(k362, "uploads");
        if (!mje.equals(a)) {
            return new yx8(h4f.n("uploads(ru.ok.tamtam.android.upload.UploadDb).\n Expected:\n", mje, "\n Found:\n", a), false);
        }
        HashMap hashMap2 = new HashMap(10);
        ije ije = r12;
        ije ije2 = new ije(0, 1, ClientCookie.PATH_ATTR, "TEXT", (String) null, false);
        hashMap2.put(ClientCookie.PATH_ATTR, ije);
        hashMap2.put("last_modified", new ije(0, 1, "last_modified", "INTEGER", (String) null, true));
        hashMap2.put("upload_type", new ije(0, 1, "upload_type", "INTEGER", (String) null, false));
        hashMap2.put("message_id", new ije(1, 1, "message_id", "INTEGER", (String) null, true));
        hashMap2.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap2.put("attach_id", new ije(3, 1, "attach_id", "TEXT", (String) null, true));
        hashMap2.put("video_quality", new ije(0, 1, "video_quality", "INTEGER", (String) null, false));
        hashMap2.put("video_start_trim_position", new ije(0, 1, "video_start_trim_position", "REAL", (String) null, false));
        hashMap2.put("video_end_trim_position", new ije(0, 1, "video_end_trim_position", "REAL", (String) null, false));
        Object obj = "video_end_trim_position";
        Object obj2 = "video_start_trim_position";
        Object obj3 = "video_quality";
        mje mje2 = new mje("message_uploads", hashMap2, h4f.o(hashMap2, "mute", new ije(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        mje a2 = mje.a(k362, "message_uploads");
        if (!mje2.equals(a2)) {
            return new yx8(h4f.n("message_uploads(ru.ok.tamtam.android.upload.message.MessageUploadDb).\n Expected:\n", mje2, "\n Found:\n", a2), false);
        }
        HashMap hashMap3 = new HashMap(8);
        hashMap3.put("finished", new ije(0, 1, "finished", "INTEGER", (String) null, true));
        hashMap3.put("prepared_path", new ije(0, 1, "prepared_path", "TEXT", (String) null, false));
        hashMap3.put("result_path", new ije(0, 1, "result_path", "TEXT", (String) null, false));
        hashMap3.put("source_uri", new ije(1, 1, "source_uri", "TEXT", (String) null, true));
        hashMap3.put("quality", new ije(2, 1, "quality", "INTEGER", (String) null, true));
        hashMap3.put("start_trim_position", new ije(3, 1, "start_trim_position", "REAL", (String) null, true));
        hashMap3.put("end_trim_position", new ije(4, 1, "end_trim_position", "REAL", (String) null, true));
        mje mje3 = new mje("video_conversions", hashMap3, h4f.o(hashMap3, "mute", new ije(5, 1, "mute", "INTEGER", "false", true), 0), new HashSet(0));
        mje a3 = mje.a(k362, "video_conversions");
        if (!mje3.equals(a3)) {
            return new yx8(h4f.n("video_conversions(ru.ok.tamtam.android.video.converter.VideoConversionDb).\n Expected:\n", mje3, "\n Found:\n", a3), false);
        }
        HashMap hashMap4 = new HashMap(9);
        hashMap4.put("latitude", new ije(0, 1, "latitude", "REAL", (String) null, true));
        hashMap4.put("longitude", new ije(0, 1, "longitude", "REAL", (String) null, true));
        hashMap4.put("altitude", new ije(0, 1, "altitude", "REAL", "0", true));
        hashMap4.put("accuracy", new ije(0, 1, "accuracy", "REAL", "0", true));
        hashMap4.put("bearing", new ije(0, 1, "bearing", "REAL", "0", true));
        hashMap4.put("speed", new ije(0, 1, "speed", "REAL", "0", true));
        hashMap4.put("device_id", new ije(0, 1, "device_id", "TEXT", (String) null, true));
        hashMap4.put("contact_server_id", new ije(1, 1, "contact_server_id", "INTEGER", (String) null, true));
        mje mje4 = new mje("contact_location", hashMap4, h4f.o(hashMap4, "time", new ije(2, 1, "time", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a4 = mje.a(k362, "contact_location");
        if (!mje4.equals(a4)) {
            return new yx8(h4f.n("contact_location(ru.ok.tamtam.android.location.live.model.ContactLocationDb).\n Expected:\n", mje4, "\n Found:\n", a4), false);
        }
        HashMap hashMap5 = new HashMap(8);
        hashMap5.put("message_time", new ije(0, 1, "message_time", "INTEGER", (String) null, true));
        hashMap5.put("live_period", new ije(0, 1, "live_period", "INTEGER", (String) null, true));
        hashMap5.put("start_time", new ije(0, 1, "start_time", "INTEGER", (String) null, true));
        hashMap5.put("end_time", new ije(0, 1, "end_time", "INTEGER", (String) null, true));
        hashMap5.put("device_id", new ije(0, 1, "device_id", "TEXT", (String) null, true));
        hashMap5.put("contact_server_id", new ije(1, 1, "contact_server_id", "INTEGER", (String) null, true));
        hashMap5.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", (String) null, true));
        mje mje5 = new mje("chat_location", hashMap5, h4f.o(hashMap5, "message_id", new ije(3, 1, "message_id", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a5 = mje.a(k362, "chat_location");
        if (!mje5.equals(a5)) {
            return new yx8(h4f.n("chat_location(ru.ok.tamtam.android.location.live.model.ChatLocationDb).\n Expected:\n", mje5, "\n Found:\n", a5), false);
        }
        HashMap hashMap6 = new HashMap(3);
        hashMap6.put("conversation_id", new ije(1, 1, "conversation_id", "TEXT", (String) null, true));
        hashMap6.put(ApiProtocol.KEY_JOIN_LINK, new ije(0, 1, ApiProtocol.KEY_JOIN_LINK, "TEXT", (String) null, true));
        mje mje6 = new mje("call_links", hashMap6, h4f.o(hashMap6, "started_at", new ije(0, 1, "started_at", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a6 = mje.a(k362, "call_links");
        if (!mje6.equals(a6)) {
            return new yx8(h4f.n("call_links(ru.ok.tamtam.android.calls.links.db.CallLinkEntryDb).\n Expected:\n", mje6, "\n Found:\n", a6), false);
        }
        HashMap hashMap7 = new HashMap(9);
        hashMap7.put("id", new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap7.put("name", new ije(0, 1, "name", "TEXT", (String) null, false));
        hashMap7.put("icon_url", new ije(0, 1, "icon_url", "TEXT", (String) null, false));
        hashMap7.put("author_id", new ije(0, 1, "author_id", "INTEGER", (String) null, true));
        hashMap7.put("created_time", new ije(0, 1, "created_time", "INTEGER", (String) null, true));
        hashMap7.put("updated_time", new ije(0, 1, "updated_time", "INTEGER", (String) null, true));
        hashMap7.put("link", new ije(0, 1, "link", "TEXT", (String) null, true));
        hashMap7.put("stickers", new ije(0, 1, "stickers", "TEXT", (String) null, true));
        String str = "icon_url";
        String str2 = "stickers";
        String str3 = "mute";
        mje mje7 = new mje("sticker_sets", hashMap7, h4f.o(hashMap7, "draft", new ije(0, 1, "draft", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a7 = mje.a(k362, "sticker_sets");
        if (!mje7.equals(a7)) {
            return new yx8(h4f.n("sticker_sets(ru.ok.tamtam.android.stickers.sets.StickerSetDb).\n Expected:\n", mje7, "\n Found:\n", a7), false);
        }
        HashMap hashMap8 = new HashMap(2);
        hashMap8.put("id", new ije(1, 1, "id", "INTEGER", (String) null, true));
        mje mje8 = new mje("favorite_sticker_sets", hashMap8, h4f.o(hashMap8, "index", new ije(0, 1, "index", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a8 = mje.a(k362, "favorite_sticker_sets");
        if (!mje8.equals(a8)) {
            return new yx8(h4f.n("favorite_sticker_sets(ru.ok.tamtam.android.stickers.sets.favorite.FavoriteStickerSetDb).\n Expected:\n", mje8, "\n Found:\n", a8), false);
        }
        HashMap hashMap9 = new HashMap(2);
        hashMap9.put("id", new ije(1, 1, "id", "INTEGER", (String) null, true));
        mje mje9 = new mje("favorite_stickers", hashMap9, h4f.o(hashMap9, "index", new ije(0, 1, "index", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a9 = mje.a(k362, "favorite_stickers");
        if (!mje9.equals(a9)) {
            return new yx8(h4f.n("favorite_stickers(ru.ok.tamtam.android.stickers.favorite.FavoriteStickerDb).\n Expected:\n", mje9, "\n Found:\n", a9), false);
        }
        HashMap hashMap10 = new HashMap(8);
        hashMap10.put("id", new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap10.put("recent_type", new ije(0, 1, "recent_type", "INTEGER", (String) null, true));
        hashMap10.put("recent_time", new ije(0, 1, "recent_time", "INTEGER", (String) null, true));
        hashMap10.put("server_id", new ije(0, 1, "server_id", "INTEGER", "0", true));
        hashMap10.put("sticker_id", new ije(0, 1, "sticker_id", "INTEGER", (String) null, false));
        hashMap10.put("emoji", new ije(0, 1, "emoji", "TEXT", (String) null, false));
        hashMap10.put("gif", new ije(0, 1, "gif", "BLOB", (String) null, false));
        String str4 = "server_id";
        String str5 = "id";
        mje mje10 = new mje("recent", hashMap10, h4f.o(hashMap10, "gif_id", new ije(0, 1, "gif_id", "INTEGER", (String) null, false), 0), new HashSet(0));
        mje a10 = mje.a(k362, "recent");
        if (!mje10.equals(a10)) {
            return new yx8(h4f.n("recent(ru.ok.tamtam.android.stickers.recents.RecentDb).\n Expected:\n", mje10, "\n Found:\n", a10), false);
        }
        HashMap hashMap11 = new HashMap(2);
        hashMap11.put("emoji", new ije(1, 1, "emoji", "TEXT", (String) null, true));
        mje mje11 = new mje("default_emoji", hashMap11, h4f.o(hashMap11, "default_value", new ije(0, 1, "default_value", "TEXT", (String) null, true), 0), new HashSet(0));
        mje a11 = mje.a(k362, "default_emoji");
        if (!mje11.equals(a11)) {
            return new yx8(h4f.n("default_emoji(ru.ok.tamtam.android.stickers.emoji.DefaultEmojiDb).\n Expected:\n", mje11, "\n Found:\n", a11), false);
        }
        HashMap hashMap12 = new HashMap(13);
        hashMap12.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap12.put("message_id", new ije(2, 1, "message_id", "INTEGER", (String) null, true));
        hashMap12.put("type", new ije(0, 1, "type", "TEXT", (String) null, true));
        hashMap12.put("chat_title", new ije(0, 1, "chat_title", "TEXT", (String) null, false));
        hashMap12.put("sender_user_name", new ije(0, 1, "sender_user_name", "TEXT", (String) null, false));
        hashMap12.put("sender_user_id", new ije(0, 1, "sender_user_id", "INTEGER", (String) null, true));
        hashMap12.put("time", new ije(0, 1, "time", "INTEGER", (String) null, true));
        hashMap12.put("text", new ije(0, 1, "text", "TEXT", (String) null, true));
        hashMap12.put("push_id", new ije(0, 1, "push_id", "INTEGER", (String) null, true));
        hashMap12.put("event_key", new ije(0, 1, "event_key", "TEXT", (String) null, false));
        hashMap12.put("large_image_url", new ije(0, 1, "large_image_url", "TEXT", "NULL", false));
        hashMap12.put("fire_m", new ije(0, 1, "fire_m", "INTEGER", "0", true));
        String str6 = "type";
        String str7 = "chat_title";
        mje mje12 = new mje("fcm_notifications", hashMap12, h4f.o(hashMap12, "has_any_error", new ije(0, 1, "has_any_error", "INTEGER", "0", true), 0), new HashSet(0));
        mje a12 = mje.a(k362, "fcm_notifications");
        if (!mje12.equals(a12)) {
            return new yx8(h4f.n("fcm_notifications(ru.ok.tamtam.android.notifications.messages.newpush.fcm.storage.model.FcmNotification).\n Expected:\n", mje12, "\n Found:\n", a12), false);
        }
        HashMap hashMap13 = new HashMap(2);
        hashMap13.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", (String) null, true));
        mje mje13 = new mje("fcm_notifications_history", hashMap13, h4f.o(hashMap13, "last_notify_msg_id", new ije(0, 1, "last_notify_msg_id", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a13 = mje.a(k362, "fcm_notifications_history");
        if (!mje13.equals(a13)) {
            return new yx8(h4f.n("fcm_notifications_history(ru.ok.tamtam.android.notifications.messages.newpush.fcm.history.model.FcmNotificationHistoryDb).\n Expected:\n", mje13, "\n Found:\n", a13), false);
        }
        HashMap hashMap14 = new HashMap(13);
        hashMap14.put("push_id", new ije(0, 1, "push_id", "INTEGER", (String) null, true));
        hashMap14.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap14.put("msg_id", new ije(2, 1, "msg_id", "INTEGER", (String) null, true));
        hashMap14.put("analytics_status", new ije(0, 1, "analytics_status", "INTEGER", (String) null, true));
        hashMap14.put("suid", new ije(0, 1, "suid", "INTEGER", (String) null, false));
        hashMap14.put("content_length", new ije(0, 1, "content_length", "INTEGER", (String) null, true));
        hashMap14.put("sent_time", new ije(0, 1, "sent_time", "INTEGER", (String) null, false));
        hashMap14.put("event_key", new ije(0, 1, "event_key", "TEXT", (String) null, false));
        hashMap14.put("fcm_sent_time", new ije(0, 1, "fcm_sent_time", "INTEGER", (String) null, true));
        hashMap14.put("received_time", new ije(0, 1, "received_time", "INTEGER", (String) null, true));
        hashMap14.put("push_type", new ije(0, 1, "push_type", "TEXT", (String) null, true));
        hashMap14.put("time", new ije(0, 1, "time", "INTEGER", (String) null, true));
        mje mje14 = new mje("fcm_notifications_analytics", hashMap14, h4f.o(hashMap14, "created_time", new ije(0, 1, "created_time", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a14 = mje.a(k362, "fcm_notifications_analytics");
        if (!mje14.equals(a14)) {
            return new yx8(h4f.n("fcm_notifications_analytics(ru.ok.tamtam.android.notifications.messages.newpush.fcm.analytics.model.FcmAnalyticsEntryDb).\n Expected:\n", mje14, "\n Found:\n", a14), false);
        }
        HashMap hashMap15 = new HashMap(2);
        hashMap15.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", (String) null, true));
        mje mje15 = new mje("notifications_read_marks", hashMap15, h4f.o(hashMap15, "mark", new ije(0, 1, "mark", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a15 = mje.a(k362, "notifications_read_marks");
        if (!mje15.equals(a15)) {
            return new yx8(h4f.n("notifications_read_marks(ru.ok.tamtam.android.notifications.messages.newpush.readmarks.model.NotificationReadMarkDb).\n Expected:\n", mje15, "\n Found:\n", a15), false);
        }
        HashMap hashMap16 = new HashMap(5);
        hashMap16.put("chat_id", new ije(2, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap16.put("message_id", new ije(1, 1, "message_id", "INTEGER", (String) null, true));
        hashMap16.put("time", new ije(0, 1, "time", "INTEGER", (String) null, true));
        hashMap16.put("fcm", new ije(0, 1, "fcm", "INTEGER", (String) null, false));
        mje mje16 = new mje("notifications_tracker_messages", hashMap16, h4f.o(hashMap16, "drop_reason", new ije(0, 1, "drop_reason", "TEXT", (String) null, false), 0), new HashSet(0));
        mje a16 = mje.a(k362, "notifications_tracker_messages");
        if (!mje16.equals(a16)) {
            return new yx8(h4f.n("notifications_tracker_messages(ru.ok.tamtam.android.notifications.messages.tracker.storage.model.NotificationsTrackerMessageDb).\n Expected:\n", mje16, "\n Found:\n", a16), false);
        }
        HashMap hashMap17 = new HashMap(9);
        hashMap17.put(ClientCookie.PATH_ATTR, new ije(0, 1, ClientCookie.PATH_ATTR, "TEXT", (String) null, true));
        hashMap17.put("last_modified", new ije(0, 1, "last_modified", "INTEGER", (String) null, true));
        hashMap17.put("upload_type", new ije(0, 1, "upload_type", "INTEGER", (String) null, true));
        hashMap17.put("chat_id", new ije(1, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap17.put("attach_id", new ije(2, 1, "attach_id", "TEXT", (String) null, true));
        hashMap17.put(obj3, new ije(0, 1, "video_quality", "INTEGER", (String) null, false));
        hashMap17.put(obj2, new ije(0, 1, "video_start_trim_position", "REAL", (String) null, false));
        hashMap17.put(obj, new ije(0, 1, "video_end_trim_position", "REAL", (String) null, false));
        mje mje17 = new mje("draft_uploads", hashMap17, h4f.o(hashMap17, str3, new ije(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        mje a17 = mje.a(k362, "draft_uploads");
        if (!mje17.equals(a17)) {
            return new yx8(h4f.n("draft_uploads(ru.ok.tamtam.android.upload.draft.DraftUploadDb).\n Expected:\n", mje17, "\n Found:\n", a17), false);
        }
        HashMap hashMap18 = new HashMap(13);
        String str8 = str5;
        hashMap18.put(str8, new ije(1, 1, "id", "TEXT", (String) null, true));
        hashMap18.put("title", new ije(0, 1, "title", "TEXT", (String) null, true));
        hashMap18.put("emoji", new ije(0, 1, "emoji", "TEXT", "NULL", false));
        hashMap18.put("order", new ije(0, 1, "order", "INTEGER", (String) null, true));
        hashMap18.put("filters", new ije(0, 1, "filters", "TEXT", (String) null, true));
        hashMap18.put("isHiddenForAllFolder", new ije(0, 1, "isHiddenForAllFolder", "INTEGER", (String) null, true));
        hashMap18.put("hideIfEmpty", new ije(0, 1, "hideIfEmpty", "INTEGER", "0", true));
        hashMap18.put("elements", new ije(0, 1, "elements", "BLOB", "NULL", false));
        hashMap18.put("creatorId", new ije(0, 1, "creatorId", "INTEGER", "NULL", false));
        hashMap18.put("filterSubjects", new ije(0, 1, "filterSubjects", "BLOB", "NULL", false));
        hashMap18.put("widgets", new ije(0, 1, "widgets", "BLOB", "NULL", false));
        hashMap18.put("options", new ije(0, 1, "options", "BLOB", "NULL", false));
        HashSet o2 = h4f.o(hashMap18, "isRemoved", new ije(0, 1, "isRemoved", "INTEGER", "0", true), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new lje("index_chat_folder_filters", false, Arrays.asList(new String[]{"filters"}), Arrays.asList(new String[]{"ASC"})));
        mje mje18 = new mje("chat_folder", hashMap18, o2, hashSet);
        mje a18 = mje.a(k362, "chat_folder");
        if (!mje18.equals(a18)) {
            return new yx8(h4f.n("chat_folder(ru.ok.tamtam.android.folders.db.RoomChatFolder).\n Expected:\n", mje18, "\n Found:\n", a18), false);
        }
        HashMap hashMap19 = new HashMap(2);
        hashMap19.put(ApiProtocol.PARAM_CHAT_ID, new ije(1, 1, ApiProtocol.PARAM_CHAT_ID, "INTEGER", (String) null, true));
        mje mje19 = new mje("folder_and_chats", hashMap19, h4f.o(hashMap19, "folderId", new ije(2, 1, "folderId", "TEXT", (String) null, true), 0), new HashSet(0));
        mje a19 = mje.a(k362, "folder_and_chats");
        if (!mje19.equals(a19)) {
            return new yx8(h4f.n("folder_and_chats(ru.ok.tamtam.android.folders.db.ChatAndFolderCrossRef).\n Expected:\n", mje19, "\n Found:\n", a19), false);
        }
        HashMap hashMap20 = new HashMap(2);
        hashMap20.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        mje mje20 = new mje("selected_mentions", hashMap20, h4f.o(hashMap20, "selectedMentionType", new ije(0, 1, "selectedMentionType", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a20 = mje.a(k362, "selected_mentions");
        if (!mje20.equals(a20)) {
            return new yx8(h4f.n("selected_mentions(ru.ok.tamtam.mentions.SelectedMention).\n Expected:\n", mje20, "\n Found:\n", a20), false);
        }
        HashSet hashSet2 = new HashSet(5);
        hashSet2.add("normalizedTitle");
        hashSet2.add("originalTitle");
        hashSet2.add("normalizedTitleWithoutEmoji");
        hashSet2.add("originalTitleWithoutEmoji");
        hashSet2.add("sortTime");
        String str9 = str7;
        h56 h56 = new h56(str9, hashSet2, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
        h56 a21 = h56.a(k362, str9);
        if (!h56.equals(a21)) {
            return new yx8("chat_title(ru.ok.tamtam.android.chat.ChatTitle).\n Expected:\n" + h56 + "\n Found:\n" + a21, false);
        }
        HashSet hashSet3 = new HashSet(5);
        hashSet3.add("link");
        hashSet3.add("allNormalizedTitles");
        hashSet3.add("allOriginalTitles");
        hashSet3.add("allNormalizedTitlesWithoutEmoji");
        hashSet3.add("allOriginalTitlesWithoutEmoji");
        h56 h562 = new h56("contact_title", hashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
        h56 a22 = h56.a(k362, "contact_title");
        if (!h562.equals(a22)) {
            return new yx8("contact_title(ru.ok.tamtam.android.contacts.ContactTitle).\n Expected:\n" + h562 + "\n Found:\n" + a22, false);
        }
        HashMap hashMap21 = new HashMap(33);
        hashMap21.put("uuid", new ije(1, 1, "uuid", "TEXT", (String) null, true));
        hashMap21.put("uniqueWorkName", new ije(0, 1, "uniqueWorkName", "TEXT", (String) null, true));
        hashMap21.put("existingWorkPolicy", new ije(0, 1, "existingWorkPolicy", "TEXT", (String) null, true));
        hashMap21.put("tags", new ije(0, 1, "tags", "TEXT", (String) null, true));
        hashMap21.put("time", new ije(0, 1, "time", "INTEGER", (String) null, true));
        hashMap21.put("state", new ije(0, 1, "state", "INTEGER", "0", true));
        hashMap21.put("work_spec_id", new ije(0, 1, "work_spec_id", "TEXT", (String) null, true));
        hashMap21.put("work_spec_state", new ije(0, 1, "work_spec_state", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_worker_class_name", new ije(0, 1, "work_spec_worker_class_name", "TEXT", (String) null, true));
        hashMap21.put("work_spec_input_merger_class_name", new ije(0, 1, "work_spec_input_merger_class_name", "TEXT", (String) null, false));
        hashMap21.put("work_spec_input", new ije(0, 1, "work_spec_input", "BLOB", (String) null, true));
        hashMap21.put("work_spec_output", new ije(0, 1, "work_spec_output", "BLOB", (String) null, true));
        hashMap21.put("work_spec_initial_delay", new ije(0, 1, "work_spec_initial_delay", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_interval_duration", new ije(0, 1, "work_spec_interval_duration", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_flex_duration", new ije(0, 1, "work_spec_flex_duration", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_run_attempt_count", new ije(0, 1, "work_spec_run_attempt_count", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_backoff_policy", new ije(0, 1, "work_spec_backoff_policy", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_backoff_delay_duration", new ije(0, 1, "work_spec_backoff_delay_duration", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_last_enqueue_time", new ije(0, 1, "work_spec_last_enqueue_time", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_minimum_retention_duration", new ije(0, 1, "work_spec_minimum_retention_duration", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_schedule_requested_at", new ije(0, 1, "work_spec_schedule_requested_at", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_run_in_foreground", new ije(0, 1, "work_spec_run_in_foreground", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_out_of_quota_policy", new ije(0, 1, "work_spec_out_of_quota_policy", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_period_count", new ije(0, 1, "work_spec_period_count", "INTEGER", "0", true));
        hashMap21.put("work_spec_generation", new ije(0, 1, "work_spec_generation", "INTEGER", "0", true));
        hashMap21.put("work_spec_required_network_type", new ije(0, 1, "work_spec_required_network_type", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_requires_charging", new ije(0, 1, "work_spec_requires_charging", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_requires_device_idle", new ije(0, 1, "work_spec_requires_device_idle", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_requires_battery_not_low", new ije(0, 1, "work_spec_requires_battery_not_low", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_requires_storage_not_low", new ije(0, 1, "work_spec_requires_storage_not_low", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_trigger_content_update_delay", new ije(0, 1, "work_spec_trigger_content_update_delay", "INTEGER", (String) null, true));
        hashMap21.put("work_spec_trigger_max_content_delay", new ije(0, 1, "work_spec_trigger_max_content_delay", "INTEGER", (String) null, true));
        HashSet o3 = h4f.o(hashMap21, "work_spec_content_uri_triggers", new ije(0, 1, "work_spec_content_uri_triggers", "BLOB", (String) null, true), 0);
        HashSet hashSet4 = new HashSet(4);
        hashSet4.add(new lje("index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration", true, Arrays.asList(new String[]{"uniqueWorkName", "work_spec_interval_duration"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet4.add(new lje("index_WorkerQueueItem_work_spec_schedule_requested_at", false, Arrays.asList(new String[]{"work_spec_schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new lje("index_WorkerQueueItem_work_spec_last_enqueue_time", false, Arrays.asList(new String[]{"work_spec_last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
        hashSet4.add(new lje("index_WorkerQueueItem_time", false, Arrays.asList(new String[]{"time"}), Arrays.asList(new String[]{"ASC"})));
        mje mje21 = new mje("WorkerQueueItem", hashMap21, o3, hashSet4);
        mje a23 = mje.a(k362, "WorkerQueueItem");
        if (!mje21.equals(a23)) {
            return new yx8(h4f.n("WorkerQueueItem(androidx.work.impl.model.WorkerQueueItem).\n Expected:\n", mje21, "\n Found:\n", a23), false);
        }
        HashMap hashMap22 = new HashMap(8);
        hashMap22.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        String str10 = str6;
        hashMap22.put(str10, new ije(0, 1, "type", "INTEGER", (String) null, true));
        hashMap22.put("status", new ije(0, 1, "status", "INTEGER", (String) null, true));
        hashMap22.put("fails_count", new ije(0, 1, "fails_count", "INTEGER", (String) null, true));
        hashMap22.put("depends_request_id", new ije(0, 1, "depends_request_id", "INTEGER", (String) null, true));
        hashMap22.put("dependency_type", new ije(0, 1, "dependency_type", "INTEGER", (String) null, true));
        hashMap22.put("data", new ije(0, 1, "data", "BLOB", (String) null, true));
        mje mje22 = new mje("tasks", hashMap22, h4f.o(hashMap22, "created_time", new ije(0, 1, "created_time", "INTEGER", (String) null, true), 0), new HashSet(0));
        mje a24 = mje.a(k362, "tasks");
        if (!mje22.equals(a24)) {
            return new yx8(h4f.n("tasks(one.me.sdk.tasks.db.TaskEntity).\n Expected:\n", mje22, "\n Found:\n", a24), false);
        }
        HashMap hashMap23 = new HashMap(5);
        hashMap23.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        String str11 = str4;
        hashMap23.put(str11, new ije(0, 1, "server_id", "INTEGER", (String) null, true));
        hashMap23.put("presence", new ije(0, 1, "presence", "INTEGER", (String) null, true));
        hashMap23.put("presence_type", new ije(0, 1, "presence_type", "INTEGER", (String) null, true));
        HashSet o4 = h4f.o(hashMap23, "data", new ije(0, 1, "data", "BLOB", (String) null, true), 0);
        HashSet hashSet5 = new HashSet(1);
        Object obj4 = "emoji";
        String str12 = "chat_id";
        String str13 = "time";
        hashSet5.add(new lje("index_contacts_server_id", false, Arrays.asList(new String[]{str11}), Arrays.asList(new String[]{"ASC"})));
        mje mje23 = new mje("contacts", hashMap23, o4, hashSet5);
        mje a25 = mje.a(k362, "contacts");
        if (!mje23.equals(a25)) {
            return new yx8(h4f.n("contacts(ru.ok.tamtam.android.contacts.db.ContactEntity).\n Expected:\n", mje23, "\n Found:\n", a25), false);
        }
        HashMap hashMap24 = new HashMap(10);
        hashMap24.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap24.put("phonebook_id", new ije(0, 1, "phonebook_id", "INTEGER", (String) null, true));
        hashMap24.put("contact_id", new ije(0, 1, "contact_id", "INTEGER", (String) null, true));
        hashMap24.put("phone", new ije(0, 1, "phone", "TEXT", (String) null, true));
        hashMap24.put("server_phone", new ije(0, 1, "server_phone", "INTEGER", (String) null, true));
        hashMap24.put("email", new ije(0, 1, "email", "TEXT", (String) null, false));
        hashMap24.put("first_name", new ije(0, 1, "first_name", "TEXT", (String) null, true));
        hashMap24.put("last_name", new ije(0, 1, "last_name", "TEXT", (String) null, false));
        hashMap24.put("avatar_path", new ije(0, 1, "avatar_path", "TEXT", (String) null, false));
        HashSet o5 = h4f.o(hashMap24, str10, new ije(0, 1, "type", "INTEGER", (String) null, true), 0);
        HashSet hashSet6 = new HashSet(3);
        hashSet6.add(new lje("index_phones_phonebook_id", false, Arrays.asList(new String[]{"phonebook_id"}), Arrays.asList(new String[]{"ASC"})));
        hashSet6.add(new lje("index_phones_type", false, Arrays.asList(new String[]{str10}), Arrays.asList(new String[]{"ASC"})));
        hashSet6.add(new lje("index_phones_server_phone", false, Arrays.asList(new String[]{"server_phone"}), Arrays.asList(new String[]{"ASC"})));
        mje mje24 = new mje("phones", hashMap24, o5, hashSet6);
        mje a26 = mje.a(k362, "phones");
        if (!mje24.equals(a26)) {
            return new yx8(h4f.n("phones(ru.ok.tamtam.android.phone.PhoneEntity).\n Expected:\n", mje24, "\n Found:\n", a26), false);
        }
        HashMap hashMap25 = new HashMap(4);
        hashMap25.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap25.put("status", new ije(0, 1, "status", "INTEGER", (String) null, true));
        hashMap25.put("entry", new ije(0, 1, "entry", "BLOB", (String) null, true));
        mje mje25 = new mje("events", hashMap25, h4f.o(hashMap25, "isCritical", new ije(0, 1, "isCritical", "INTEGER", "0", true), 0), new HashSet(0));
        mje a27 = mje.a(k362, "events");
        if (!mje25.equals(a27)) {
            return new yx8(h4f.n("events(ru.ok.tamtam.android.stats.StatEntity).\n Expected:\n", mje25, "\n Found:\n", a27), false);
        }
        HashMap hashMap26 = new HashMap(16);
        hashMap26.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap26.put("sticker_id", new ije(0, 1, "sticker_id", "INTEGER", (String) null, true));
        hashMap26.put("width", new ije(0, 1, "width", "INTEGER", (String) null, true));
        hashMap26.put("height", new ije(0, 1, "height", "INTEGER", (String) null, true));
        hashMap26.put("url", new ije(0, 1, "url", "TEXT", (String) null, false));
        hashMap26.put("update_time", new ije(0, 1, "update_time", "INTEGER", (String) null, true));
        hashMap26.put("mp4_url", new ije(0, 1, "mp4_url", "TEXT", (String) null, false));
        hashMap26.put("first_url", new ije(0, 1, "first_url", "TEXT", (String) null, false));
        hashMap26.put("preview_url", new ije(0, 1, "preview_url", "TEXT", (String) null, false));
        hashMap26.put("tags", new ije(0, 1, "tags", "TEXT", (String) null, true));
        hashMap26.put("sticker_type", new ije(0, 1, "sticker_type", "INTEGER", (String) null, true));
        hashMap26.put("set_id", new ije(0, 1, "set_id", "INTEGER", (String) null, true));
        hashMap26.put("lottie_url", new ije(0, 1, "lottie_url", "TEXT", (String) null, false));
        hashMap26.put(MediaStreamTrack.AUDIO_TRACK_KIND, new ije(0, 1, MediaStreamTrack.AUDIO_TRACK_KIND, "INTEGER", (String) null, true));
        hashMap26.put("author_type", new ije(0, 1, "author_type", "INTEGER", (String) null, true));
        String str14 = str2;
        mje mje26 = new mje(str14, hashMap26, h4f.o(hashMap26, "video_url", new ije(0, 1, "video_url", "TEXT", (String) null, false), 0), new HashSet(0));
        mje a28 = mje.a(k362, str14);
        if (!mje26.equals(a28)) {
            return new yx8(h4f.n("stickers(ru.ok.tamtam.android.stickers.db.StickerEntity).\n Expected:\n", mje26, "\n Found:\n", a28), false);
        }
        HashMap hashMap27 = new HashMap(6);
        hashMap27.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap27.put(str11, new ije(0, 1, "server_id", "INTEGER", (String) null, true));
        hashMap27.put("data", new ije(0, 1, "data", "BLOB", (String) null, true));
        hashMap27.put("favourite_index", new ije(0, 1, "favourite_index", "INTEGER", (String) null, true));
        hashMap27.put("sort_time", new ije(0, 1, "sort_time", "INTEGER", (String) null, true));
        HashSet o6 = h4f.o(hashMap27, "cid", new ije(0, 1, "cid", "INTEGER", "0", true), 0);
        HashSet hashSet7 = new HashSet(4);
        String str15 = str10;
        Object obj5 = "status";
        hashSet7.add(new lje("index_chats_server_id", false, Arrays.asList(new String[]{str11}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new lje("index_chats_cid", false, Arrays.asList(new String[]{"cid"}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new lje("index_chats_favourite_index", false, Arrays.asList(new String[]{"favourite_index"}), Arrays.asList(new String[]{"ASC"})));
        hashSet7.add(new lje("index_chats_favourite_index_sort_time_id", false, Arrays.asList(new String[]{"favourite_index", "sort_time", str8}), Arrays.asList(new String[]{"ASC", "DESC", "DESC"})));
        mje mje27 = new mje("chats", hashMap27, o6, hashSet7);
        mje a29 = mje.a(k362, "chats");
        if (!mje27.equals(a29)) {
            return new yx8(h4f.n("chats(ru.ok.tamtam.android.chat.ChatEntity).\n Expected:\n", mje27, "\n Found:\n", a29), false);
        }
        HashMap hashMap28 = new HashMap(36);
        hashMap28.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap28.put(str11, new ije(0, 1, "server_id", "INTEGER", (String) null, true));
        String str16 = str13;
        hashMap28.put(str16, new ije(0, 1, "time", "INTEGER", (String) null, true));
        hashMap28.put("update_time", new ije(0, 1, "update_time", "INTEGER", (String) null, true));
        hashMap28.put("sender", new ije(0, 1, "sender", "INTEGER", (String) null, true));
        hashMap28.put("cid", new ije(0, 1, "cid", "INTEGER", (String) null, true));
        hashMap28.put("text", new ije(0, 1, "text", "TEXT", (String) null, false));
        hashMap28.put("delivery_status", new ije(0, 1, "delivery_status", "INTEGER", (String) null, true));
        hashMap28.put(obj5, new ije(0, 1, "status", "INTEGER", (String) null, true));
        hashMap28.put("time_local", new ije(0, 1, "time_local", "INTEGER", (String) null, true));
        hashMap28.put("error", new ije(0, 1, "error", "TEXT", (String) null, false));
        hashMap28.put("localized_error", new ije(0, 1, "localized_error", "TEXT", (String) null, false));
        hashMap28.put("attaches", new ije(0, 1, "attaches", "BLOB", (String) null, false));
        hashMap28.put("media_type", new ije(0, 1, "media_type", "INTEGER", (String) null, true));
        hashMap28.put("detect_share", new ije(0, 1, "detect_share", "INTEGER", (String) null, true));
        hashMap28.put("msg_link_type", new ije(0, 1, "msg_link_type", "INTEGER", (String) null, true));
        hashMap28.put("msg_link_id", new ije(0, 1, "msg_link_id", "INTEGER", (String) null, true));
        hashMap28.put("inserted_from_msg_link", new ije(0, 1, "inserted_from_msg_link", "INTEGER", (String) null, true));
        hashMap28.put("msg_link_chat_id", new ije(0, 1, "msg_link_chat_id", "INTEGER", (String) null, true));
        hashMap28.put("msg_link_chat_name", new ije(0, 1, "msg_link_chat_name", "TEXT", (String) null, false));
        hashMap28.put("msg_link_chat_link", new ije(0, 1, "msg_link_chat_link", "TEXT", (String) null, false));
        hashMap28.put("msg_link_out_chat_id", new ije(0, 1, "msg_link_out_chat_id", "INTEGER", (String) null, true));
        hashMap28.put("msg_link_out_msg_id", new ije(0, 1, "msg_link_out_msg_id", "INTEGER", (String) null, true));
        hashMap28.put(str15, new ije(0, 1, "type", "INTEGER", (String) null, true));
        String str17 = str12;
        hashMap28.put(str17, new ije(0, 1, "chat_id", "INTEGER", (String) null, true));
        hashMap28.put("ttl", new ije(0, 1, "ttl", "INTEGER", (String) null, true));
        hashMap28.put("channel_views", new ije(0, 1, "channel_views", "INTEGER", (String) null, true));
        hashMap28.put("channel_forwards", new ije(0, 1, "channel_forwards", "INTEGER", (String) null, true));
        hashMap28.put("view_time", new ije(0, 1, "view_time", "INTEGER", (String) null, true));
        hashMap28.put("zoom", new ije(0, 1, "zoom", "INTEGER", (String) null, true));
        hashMap28.put("options", new ije(0, 1, "options", "INTEGER", (String) null, true));
        hashMap28.put("live_until", new ije(0, 1, "live_until", "INTEGER", (String) null, true));
        hashMap28.put("elements", new ije(0, 1, "elements", "BLOB", (String) null, true));
        hashMap28.put("reactions", new ije(0, 1, "reactions", "BLOB", (String) null, false));
        hashMap28.put("delayed_attrs_time_to_fire", new ije(0, 1, "delayed_attrs_time_to_fire", "INTEGER", (String) null, false));
        HashSet o7 = h4f.o(hashMap28, "delayed_attrs_notify_sender", new ije(0, 1, "delayed_attrs_notify_sender", "INTEGER", (String) null, false), 1);
        o7.add(new jje("chats", "NO ACTION", "NO ACTION", Arrays.asList(new String[]{str17}), Arrays.asList(new String[]{str8})));
        HashSet hashSet8 = new HashSet(6);
        Object obj6 = "update_time";
        hashSet8.add(new lje("index_messages_chat_id", false, Arrays.asList(new String[]{str17}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new lje("index_messages_cid", false, Arrays.asList(new String[]{"cid"}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new lje("index_messages_server_id", false, Arrays.asList(new String[]{str11}), Arrays.asList(new String[]{"ASC"})));
        hashSet8.add(new lje("index_messages_chat_id_time", false, Arrays.asList(new String[]{str17, str16}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet8.add(new lje("index_messages_chat_id_media_type", false, Arrays.asList(new String[]{str17, "media_type"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        hashSet8.add(new lje("index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender", false, Arrays.asList(new String[]{"delayed_attrs_time_to_fire", "delayed_attrs_notify_sender"}), Arrays.asList(new String[]{"ASC", "ASC"})));
        mje mje28 = new mje("messages", hashMap28, o7, hashSet8);
        mje a30 = mje.a(k362, "messages");
        if (!mje28.equals(a30)) {
            return new yx8(h4f.n("messages(ru.ok.tamtam.android.messages.MessageEntity).\n Expected:\n", mje28, "\n Found:\n", a30), false);
        }
        HashMap hashMap29 = new HashMap(7);
        hashMap29.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        Object obj7 = obj6;
        hashMap29.put(obj7, new ije(0, 1, "update_time", "INTEGER", (String) null, true));
        hashMap29.put(obj4, new ije(0, 1, "emoji", "TEXT", (String) null, true));
        hashMap29.put("lottie_url", new ije(0, 1, "lottie_url", "TEXT", (String) null, false));
        hashMap29.put("lottie_play_url", new ije(0, 1, "lottie_play_url", "TEXT", (String) null, false));
        hashMap29.put("set_id", new ije(0, 1, "set_id", "INTEGER", (String) null, false));
        String str18 = str;
        mje mje29 = new mje("animoji", hashMap29, h4f.o(hashMap29, str18, new ije(0, 1, "icon_url", "TEXT", "NULL", false), 0), new HashSet(0));
        mje a31 = mje.a(k362, "animoji");
        if (!mje29.equals(a31)) {
            return new yx8(h4f.n("animoji(ru.ok.tamtam.android.animoji.db.AnimojiEntity).\n Expected:\n", mje29, "\n Found:\n", a31), false);
        }
        HashMap hashMap30 = new HashMap(6);
        hashMap30.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap30.put("name", new ije(0, 1, "name", "TEXT", (String) null, true));
        hashMap30.put(str18, new ije(0, 1, "icon_url", "TEXT", (String) null, true));
        hashMap30.put("icon_lottie_url", new ije(0, 1, "icon_lottie_url", "TEXT", (String) null, false));
        hashMap30.put(obj7, new ije(0, 1, "update_time", "INTEGER", (String) null, true));
        mje mje30 = new mje("animoji_set", hashMap30, h4f.o(hashMap30, "animoji_ids", new ije(0, 1, "animoji_ids", "TEXT", (String) null, true), 0), new HashSet(0));
        mje a32 = mje.a(k362, "animoji_set");
        if (!mje30.equals(a32)) {
            return new yx8(h4f.n("animoji_set(ru.ok.tamtam.android.animoji.db.AnimojiSetEntity).\n Expected:\n", mje30, "\n Found:\n", a32), false);
        }
        HashMap hashMap31 = new HashMap(3);
        hashMap31.put(str8, new ije(1, 1, "id", "TEXT", (String) null, true));
        hashMap31.put(obj7, new ije(0, 1, "update_time", "INTEGER", (String) null, true));
        mje mje31 = new mje("reactions_section", hashMap31, h4f.o(hashMap31, "reactions", new ije(0, 1, "reactions", "TEXT", (String) null, true), 0), new HashSet(0));
        mje a33 = mje.a(k362, "reactions_section");
        if (!mje31.equals(a33)) {
            return new yx8(h4f.n("reactions_section(ru.ok.tamtam.android.animoji.db.ReactionsSectionEntity).\n Expected:\n", mje31, "\n Found:\n", a33), false);
        }
        HashMap hashMap32 = new HashMap(2);
        hashMap32.put("user_id", new ije(1, 1, "user_id", "INTEGER", (String) null, true));
        HashSet o8 = h4f.o(hashMap32, str17, new ije(0, 1, "chat_id", "INTEGER", (String) null, true), 0);
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new lje("index_saved_msg_chat_chat_id", true, Arrays.asList(new String[]{str17}), Arrays.asList(new String[]{"ASC"})));
        mje mje32 = new mje("saved_msg_chat", hashMap32, o8, hashSet9);
        mje a34 = mje.a(k362, "saved_msg_chat");
        if (!mje32.equals(a34)) {
            return new yx8(h4f.n("saved_msg_chat(ru.ok.tamtam.android.chat.SavedMessagesChatEntity).\n Expected:\n", mje32, "\n Found:\n", a34), false);
        }
        HashMap hashMap33 = new HashMap(6);
        hashMap33.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap33.put("user_id", new ije(0, 1, "user_id", "INTEGER", (String) null, true));
        hashMap33.put("bot_id", new ije(0, 1, "bot_id", "INTEGER", (String) null, true));
        hashMap33.put(ApiProtocol.KEY_TOKEN, new ije(0, 1, ApiProtocol.KEY_TOKEN, "TEXT", (String) null, false));
        hashMap33.put("access_requested", new ije(0, 1, "access_requested", "INTEGER", (String) null, true));
        HashSet o9 = h4f.o(hashMap33, "access_granted", new ije(0, 1, "access_granted", "INTEGER", (String) null, true), 0);
        HashSet hashSet10 = new HashSet(2);
        hashSet10.add(new lje("index_webapp_biometry_user_id", false, Arrays.asList(new String[]{"user_id"}), Arrays.asList(new String[]{"ASC"})));
        hashSet10.add(new lje("index_webapp_biometry_bot_id", false, Arrays.asList(new String[]{"bot_id"}), Arrays.asList(new String[]{"ASC"})));
        mje mje33 = new mje("webapp_biometry", hashMap33, o9, hashSet10);
        mje a35 = mje.a(k362, "webapp_biometry");
        if (!mje33.equals(a35)) {
            return new yx8(h4f.n("webapp_biometry(ru.ok.tamtam.android.webapp.WebAppBiometryEntity).\n Expected:\n", mje33, "\n Found:\n", a35), false);
        }
        HashMap hashMap34 = new HashMap(3);
        hashMap34.put(str8, new ije(1, 1, "id", "INTEGER", (String) null, true));
        hashMap34.put(str11, new ije(0, 1, "server_id", "INTEGER", (String) null, true));
        HashSet o10 = h4f.o(hashMap34, "profile", new ije(0, 1, "profile", "BLOB", (String) null, true), 0);
        HashSet hashSet11 = new HashSet(1);
        hashSet11.add(new lje("index_profile_server_id", true, Arrays.asList(new String[]{str11}), Arrays.asList(new String[]{"ASC"})));
        mje mje34 = new mje("profile", hashMap34, o10, hashSet11);
        mje a36 = mje.a(k362, "profile");
        return !mje34.equals(a36) ? new yx8(h4f.n("profile(ru.ok.tamtam.android.profile.db.ProfileEntity).\n Expected:\n", mje34, "\n Found:\n", a36), false) : new yx8((String) null, true);
    }

    public final void b(k36 k36) {
        switch (this.c) {
            case 0:
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `uploads` (`attach_local_id` TEXT, `prepared_path` TEXT, `file_name` TEXT, `upload_url` TEXT, `upload_progress` REAL NOT NULL, `total_bytes` INTEGER NOT NULL, `upload_status` INTEGER, `created_time` INTEGER NOT NULL, `path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `photo_token` TEXT, `attach_id` INTEGER, PRIMARY KEY(`path`, `last_modified`, `upload_type`))", "CREATE TABLE IF NOT EXISTS `message_uploads` (`path` TEXT, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER, `message_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`message_id`, `chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `video_conversions` (`finished` INTEGER NOT NULL, `prepared_path` TEXT, `result_path` TEXT, `source_uri` TEXT NOT NULL, `quality` INTEGER NOT NULL, `start_trim_position` REAL NOT NULL, `end_trim_position` REAL NOT NULL, `mute` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`source_uri`, `quality`, `start_trim_position`, `end_trim_position`, `mute`))", "CREATE TABLE IF NOT EXISTS `contact_location` (`latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL DEFAULT 0, `accuracy` REAL NOT NULL DEFAULT 0, `bearing` REAL NOT NULL DEFAULT 0, `speed` REAL NOT NULL DEFAULT 0, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `time`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `chat_location` (`message_time` INTEGER NOT NULL, `live_period` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `chat_id`, `message_id`))", "CREATE TABLE IF NOT EXISTS `call_links` (`conversation_id` TEXT NOT NULL, `join_link` TEXT NOT NULL, `started_at` INTEGER NOT NULL, PRIMARY KEY(`conversation_id`))", "CREATE TABLE IF NOT EXISTS `sticker_sets` (`id` INTEGER NOT NULL, `name` TEXT, `icon_url` TEXT, `author_id` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `updated_time` INTEGER NOT NULL, `link` TEXT NOT NULL, `stickers` TEXT NOT NULL, `draft` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `favorite_sticker_sets` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `favorite_stickers` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `recent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recent_type` INTEGER NOT NULL, `recent_time` INTEGER NOT NULL, `server_id` INTEGER NOT NULL DEFAULT 0, `sticker_id` INTEGER, `emoji` TEXT, `gif` BLOB, `gif_id` INTEGER)", "CREATE TABLE IF NOT EXISTS `default_emoji` (`emoji` TEXT NOT NULL, `default_value` TEXT NOT NULL, PRIMARY KEY(`emoji`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `message_id`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `fcm_notifications_history` (`chat_id` INTEGER NOT NULL, `last_notify_msg_id` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications_analytics` (`push_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `msg_id` INTEGER NOT NULL, `analytics_status` INTEGER NOT NULL, `suid` INTEGER, `content_length` INTEGER NOT NULL, `sent_time` INTEGER, `event_key` TEXT, `fcm_sent_time` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`chat_id`, `msg_id`))", "CREATE TABLE IF NOT EXISTS `notifications_read_marks` (`chat_id` INTEGER NOT NULL, `mark` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `notifications_tracker_messages` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `fcm` INTEGER, `drop_reason` TEXT, PRIMARY KEY(`message_id`, `chat_id`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `draft_uploads` (`path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `emoji` TEXT DEFAULT NULL, `order` INTEGER NOT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `hideIfEmpty` INTEGER NOT NULL DEFAULT 0, `elements` BLOB DEFAULT NULL, `creatorId` INTEGER DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `isRemoved` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)", "CREATE TABLE IF NOT EXISTS `folder_and_chats` (`chatId` INTEGER NOT NULL, `folderId` TEXT NOT NULL, PRIMARY KEY(`chatId`, `folderId`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `selected_mentions` (`id` INTEGER NOT NULL, `selectedMentionType` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)", "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)", "CREATE TABLE IF NOT EXISTS `WorkerQueueItem` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`uuid`))");
                ey8.l(k36, "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`, `work_spec_interval_duration`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `tasks` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, `fails_count` INTEGER NOT NULL, `depends_request_id` INTEGER NOT NULL, `dependency_type` INTEGER NOT NULL, `data` BLOB NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence` INTEGER NOT NULL, `presence_type` INTEGER NOT NULL, `data` BLOB NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)", "CREATE TABLE IF NOT EXISTS `phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)", "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)", "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)", "CREATE TABLE IF NOT EXISTS `events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status` INTEGER NOT NULL, `entry` BLOB NOT NULL, `isCritical` INTEGER NOT NULL DEFAULT 0)");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL, `video_url` TEXT)", "CREATE TABLE IF NOT EXISTS `chats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL, `favourite_index` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `cid` INTEGER NOT NULL DEFAULT 0)", "CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index` ON `chats` (`favourite_index`)", "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index_sort_time_id` ON `chats` (`favourite_index` ASC, `sort_time` DESC, `id` DESC)", "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)", "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)", "CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, `icon_url` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)", "CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)", "CREATE TABLE IF NOT EXISTS `profile` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `profile` BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_profile_server_id` ON `profile` (`server_id`)", "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k36.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f23a258b18fc08c44a6e0c456b946baa')");
                return;
            default:
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                ey8.l(k36, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                ey8.l(k36, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                k36.U("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                k36.U("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                k36.U("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
        }
    }

    public final void c(k36 k36) {
        switch (this.c) {
            case 0:
                ey8.l(k36, "DROP TABLE IF EXISTS `uploads`", "DROP TABLE IF EXISTS `message_uploads`", "DROP TABLE IF EXISTS `video_conversions`", "DROP TABLE IF EXISTS `contact_location`");
                ey8.l(k36, "DROP TABLE IF EXISTS `chat_location`", "DROP TABLE IF EXISTS `call_links`", "DROP TABLE IF EXISTS `sticker_sets`", "DROP TABLE IF EXISTS `favorite_sticker_sets`");
                ey8.l(k36, "DROP TABLE IF EXISTS `favorite_stickers`", "DROP TABLE IF EXISTS `recent`", "DROP TABLE IF EXISTS `default_emoji`", "DROP TABLE IF EXISTS `fcm_notifications`");
                ey8.l(k36, "DROP TABLE IF EXISTS `fcm_notifications_history`", "DROP TABLE IF EXISTS `fcm_notifications_analytics`", "DROP TABLE IF EXISTS `notifications_read_marks`", "DROP TABLE IF EXISTS `notifications_tracker_messages`");
                ey8.l(k36, "DROP TABLE IF EXISTS `draft_uploads`", "DROP TABLE IF EXISTS `chat_folder`", "DROP TABLE IF EXISTS `folder_and_chats`", "DROP TABLE IF EXISTS `selected_mentions`");
                ey8.l(k36, "DROP TABLE IF EXISTS `chat_title`", "DROP TABLE IF EXISTS `contact_title`", "DROP TABLE IF EXISTS `WorkerQueueItem`", "DROP TABLE IF EXISTS `tasks`");
                ey8.l(k36, "DROP TABLE IF EXISTS `contacts`", "DROP TABLE IF EXISTS `phones`", "DROP TABLE IF EXISTS `events`", "DROP TABLE IF EXISTS `stickers`");
                ey8.l(k36, "DROP TABLE IF EXISTS `chats`", "DROP TABLE IF EXISTS `messages`", "DROP TABLE IF EXISTS `animoji`", "DROP TABLE IF EXISTS `animoji_set`");
                ey8.l(k36, "DROP TABLE IF EXISTS `reactions_section`", "DROP TABLE IF EXISTS `saved_msg_chat`", "DROP TABLE IF EXISTS `webapp_biometry`", "DROP TABLE IF EXISTS `profile`");
                List<m23> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (m23 m23 : list) {
                        m23.getClass();
                    }
                    return;
                }
                return;
            default:
                ey8.l(k36, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                k36.U("DROP TABLE IF EXISTS `WorkName`");
                k36.U("DROP TABLE IF EXISTS `WorkProgress`");
                k36.U("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) workDatabase_Impl.g.get(i)).getClass();
                    }
                    return;
                }
                return;
        }
    }

    public final void n() {
        switch (this.c) {
            case 0:
                List<m23> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (m23 m23 : list) {
                        m23.getClass();
                    }
                    return;
                }
                return;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.o;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) workDatabase_Impl.g.get(i)).getClass();
                    }
                    return;
                }
                return;
        }
    }

    public final void o(k36 k36) {
        switch (this.c) {
            case 0:
                ((OneMeRoomDatabase_Impl) this.o).a = k36;
                k36.U("PRAGMA foreign_keys = ON");
                ((OneMeRoomDatabase_Impl) this.o).m(k36);
                List<m23> list = ((OneMeRoomDatabase_Impl) this.o).g;
                if (list != null) {
                    for (m23 a : list) {
                        a.a(k36);
                    }
                    return;
                }
                return;
            default:
                ((WorkDatabase_Impl) this.o).a = k36;
                k36.U("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.o).m(k36);
                List list2 = ((WorkDatabase_Impl) this.o).g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((m23) ((WorkDatabase_Impl) this.o).g.get(i)).a(k36);
                    }
                    return;
                }
                return;
        }
    }

    public final void q(k36 k36) {
        switch (this.c) {
            case 0:
                ngg.p(k36);
                return;
            default:
                ngg.p(k36);
                return;
        }
    }

    public final yx8 r(k36 k36) {
        k36 k362 = k36;
        switch (this.c) {
            case 0:
                return v(k36);
            default:
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", (String) null, true));
                HashSet o2 = h4f.o(hashMap, "prerequisite_id", new ije(2, 1, "prerequisite_id", "TEXT", (String) null, true), 2);
                o2.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                o2.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new lje("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                hashSet.add(new lje("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"})));
                mje mje = new mje("Dependency", hashMap, o2, hashSet);
                mje a = mje.a(k362, "Dependency");
                if (!mje.equals(a)) {
                    return new yx8(h4f.n("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", mje, "\n Found:\n", a), false);
                }
                HashMap hashMap2 = new HashMap(27);
                hashMap2.put("id", new ije(1, 1, "id", "TEXT", (String) null, true));
                hashMap2.put("state", new ije(0, 1, "state", "INTEGER", (String) null, true));
                hashMap2.put("worker_class_name", new ije(0, 1, "worker_class_name", "TEXT", (String) null, true));
                hashMap2.put("input_merger_class_name", new ije(0, 1, "input_merger_class_name", "TEXT", (String) null, false));
                hashMap2.put("input", new ije(0, 1, "input", "BLOB", (String) null, true));
                hashMap2.put("output", new ije(0, 1, "output", "BLOB", (String) null, true));
                hashMap2.put("initial_delay", new ije(0, 1, "initial_delay", "INTEGER", (String) null, true));
                hashMap2.put("interval_duration", new ije(0, 1, "interval_duration", "INTEGER", (String) null, true));
                hashMap2.put("flex_duration", new ije(0, 1, "flex_duration", "INTEGER", (String) null, true));
                hashMap2.put("run_attempt_count", new ije(0, 1, "run_attempt_count", "INTEGER", (String) null, true));
                hashMap2.put("backoff_policy", new ije(0, 1, "backoff_policy", "INTEGER", (String) null, true));
                hashMap2.put("backoff_delay_duration", new ije(0, 1, "backoff_delay_duration", "INTEGER", (String) null, true));
                hashMap2.put("last_enqueue_time", new ije(0, 1, "last_enqueue_time", "INTEGER", (String) null, true));
                hashMap2.put("minimum_retention_duration", new ije(0, 1, "minimum_retention_duration", "INTEGER", (String) null, true));
                hashMap2.put("schedule_requested_at", new ije(0, 1, "schedule_requested_at", "INTEGER", (String) null, true));
                hashMap2.put("run_in_foreground", new ije(0, 1, "run_in_foreground", "INTEGER", (String) null, true));
                hashMap2.put("out_of_quota_policy", new ije(0, 1, "out_of_quota_policy", "INTEGER", (String) null, true));
                hashMap2.put("period_count", new ije(0, 1, "period_count", "INTEGER", "0", true));
                hashMap2.put("generation", new ije(0, 1, "generation", "INTEGER", "0", true));
                hashMap2.put("required_network_type", new ije(0, 1, "required_network_type", "INTEGER", (String) null, true));
                hashMap2.put("requires_charging", new ije(0, 1, "requires_charging", "INTEGER", (String) null, true));
                hashMap2.put("requires_device_idle", new ije(0, 1, "requires_device_idle", "INTEGER", (String) null, true));
                hashMap2.put("requires_battery_not_low", new ije(0, 1, "requires_battery_not_low", "INTEGER", (String) null, true));
                hashMap2.put("requires_storage_not_low", new ije(0, 1, "requires_storage_not_low", "INTEGER", (String) null, true));
                hashMap2.put("trigger_content_update_delay", new ije(0, 1, "trigger_content_update_delay", "INTEGER", (String) null, true));
                hashMap2.put("trigger_max_content_delay", new ije(0, 1, "trigger_max_content_delay", "INTEGER", (String) null, true));
                HashSet o3 = h4f.o(hashMap2, "content_uri_triggers", new ije(0, 1, "content_uri_triggers", "BLOB", (String) null, true), 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new lje("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"})));
                hashSet2.add(new lje("index_WorkSpec_last_enqueue_time", false, Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"})));
                mje mje2 = new mje("WorkSpec", hashMap2, o3, hashSet2);
                mje a2 = mje.a(k362, "WorkSpec");
                if (!mje2.equals(a2)) {
                    return new yx8(h4f.n("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", mje2, "\n Found:\n", a2), false);
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new ije(1, 1, "tag", "TEXT", (String) null, true));
                HashSet o4 = h4f.o(hashMap3, "work_spec_id", new ije(2, 1, "work_spec_id", "TEXT", (String) null, true), 1);
                o4.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new lje("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                mje mje3 = new mje("WorkTag", hashMap3, o4, hashSet3);
                mje a3 = mje.a(k362, "WorkTag");
                if (!mje3.equals(a3)) {
                    return new yx8(h4f.n("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", mje3, "\n Found:\n", a3), false);
                }
                HashMap hashMap4 = new HashMap(3);
                hashMap4.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", (String) null, true));
                hashMap4.put("generation", new ije(2, 1, "generation", "INTEGER", "0", true));
                HashSet o5 = h4f.o(hashMap4, "system_id", new ije(0, 1, "system_id", "INTEGER", (String) null, true), 1);
                o5.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                mje mje4 = new mje("SystemIdInfo", hashMap4, o5, new HashSet(0));
                mje a4 = mje.a(k362, "SystemIdInfo");
                if (!mje4.equals(a4)) {
                    return new yx8(h4f.n("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", mje4, "\n Found:\n", a4), false);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put("name", new ije(1, 1, "name", "TEXT", (String) null, true));
                HashSet o6 = h4f.o(hashMap5, "work_spec_id", new ije(2, 1, "work_spec_id", "TEXT", (String) null, true), 1);
                o6.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new lje("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"})));
                mje mje5 = new mje("WorkName", hashMap5, o6, hashSet4);
                mje a5 = mje.a(k362, "WorkName");
                if (!mje5.equals(a5)) {
                    return new yx8(h4f.n("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", mje5, "\n Found:\n", a5), false);
                }
                HashMap hashMap6 = new HashMap(2);
                hashMap6.put("work_spec_id", new ije(1, 1, "work_spec_id", "TEXT", (String) null, true));
                HashSet o7 = h4f.o(hashMap6, "progress", new ije(0, 1, "progress", "BLOB", (String) null, true), 1);
                o7.add(new jje("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
                mje mje6 = new mje("WorkProgress", hashMap6, o7, new HashSet(0));
                mje a6 = mje.a(k362, "WorkProgress");
                if (!mje6.equals(a6)) {
                    return new yx8(h4f.n("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", mje6, "\n Found:\n", a6), false);
                }
                HashMap hashMap7 = new HashMap(2);
                hashMap7.put("key", new ije(1, 1, "key", "TEXT", (String) null, true));
                mje mje7 = new mje("Preference", hashMap7, h4f.o(hashMap7, "long_value", new ije(0, 1, "long_value", "INTEGER", (String) null, false), 0), new HashSet(0));
                mje a7 = mje.a(k362, "Preference");
                return !mje7.equals(a7) ? new yx8(h4f.n("Preference(androidx.work.impl.model.Preference).\n Expected:\n", mje7, "\n Found:\n", a7), false) : new yx8((String) null, true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rfa(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        super(15, 5);
        this.o = oneMeRoomDatabase_Impl;
    }
}
