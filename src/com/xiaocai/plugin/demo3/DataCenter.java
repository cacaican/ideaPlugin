package com.xiaocai.plugin.demo3;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName DataCenter
 * @Description TODO
 * @Author xiaocai
 * @Date 2021/12/12
 */
public class DataCenter {

    /**
     * 选择的文本
     */
    public static String SELECTED_TEXT = null;
    /**
     * 当前的文件名称
     */
    public static String CURRENT_FILE_NAME = null;
    /**
     *  当前的文件类型
     */
    public static String CURRENT_FILE_TYPE = null;
    /**
     * 笔记列表集合
     */
    public static List<NoteData> NOTE_LIST = new LinkedList<>();

    public static String getSelectedText() {
        return SELECTED_TEXT;
    }

    public static void setSelectedText(String selectedText) {
        SELECTED_TEXT = selectedText;
    }

    public static String getCurrentFileName() {
        return CURRENT_FILE_NAME;
    }

    public static void setCurrentFileName(String currentFileName) {
        CURRENT_FILE_NAME = currentFileName;
    }

    public static String getCurrentFileType() {
        return CURRENT_FILE_TYPE;
    }

    public static void setCurrentFileType(String currentFileType) {
        CURRENT_FILE_TYPE = currentFileType;
    }

    public static List<NoteData> getNoteList() {
        return NOTE_LIST;
    }

    public static void setNoteList(List<NoteData> noteList) {
        NOTE_LIST = noteList;
    }
}
