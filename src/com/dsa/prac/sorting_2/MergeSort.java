package com.dsa.prac.sorting_2;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	// 3, 1, 2, 4, 1, 5, 2, 6, 4
	public void mergeSort(int[] a, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge(a, low, mid, high);
		}
	}

	//best
	private void merge(int[] a, int low, int mid, int high) {
		List<Integer> list = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (a[left] <= a[right]) {
				list.add(a[left++]);
			} else {
				list.add(a[right++]);
			}
		}

		while (left <= mid) {
			list.add(a[left++]);
		}

		while (right <= high) {
			list.add(a[right++]);
		}

		for (int j = low; j <= high; j++) {
			a[j] = list.get(j - low);
		}
	}
	
	public void mergeSort_2(int[] a, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(a, low, mid);
			mergeSort(a, mid + 1, high);
			merge_2(a, low, mid, high);
		}
	}

	private void merge_2(int[] a, int low, int mid, int high) {
		int n1 = mid - low + 1;
		int n2 = high - mid;

		int[] L = new int[n1];
		int[] R = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = a[low + i];
		}

		for (int j = 0; j < n2; j++) {
			R[j] = a[mid + 1 + j];
		}

		int k = low;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				a[k] = L[i++];
			} else {
				a[k] = R[j++];
			}
			k++;
		}

		while (i < n1) {
			a[k++] = L[i++];
		}

		while (j < n2) {
			a[k++] = R[j++];
		}
	}
	
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		MergeSort mergeSort = new MergeSort();

		int[] a = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
		mergeSort.mergeSort(a, 0, a.length - 1);
		printArray(a);
		
		System.out.println();
		int[] a1 = { 3, 1, 2, 4, 1, 5, 2, 6, 4 };
		mergeSort.mergeSort_2(a1, 0, a1.length - 1);
		printArray(a1);
	}
}
