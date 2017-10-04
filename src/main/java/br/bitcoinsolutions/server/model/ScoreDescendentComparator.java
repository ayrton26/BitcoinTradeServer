/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bitcoinsolutions.server.model;

import java.util.Comparator;

/**
 *
 * @author ayrton
 */
public class ScoreDescendentComparator implements Comparator<Score>{
    public int compare(Score left, Score right){
        return left.getPontos() - right.getPontos();
    }
    
}
