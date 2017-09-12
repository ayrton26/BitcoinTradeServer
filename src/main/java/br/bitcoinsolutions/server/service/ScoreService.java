/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.bitcoinsolutions.server.service;

import br.bitcoinsolutions.server.model.Score;
import br.bitcoinsolutions.server.model.Usuario;
import br.bitcoinsolutions.server.persistence.GenericDAO;
import javax.ejb.Stateless;


/**
 *
 * @author tj
 */
@Stateless
public class ScoreService extends GenericDAO<Score>{
    
    public void fill(){
        
        Usuario u  = new Usuario(1,"Catapóbio","cata@gmail.com.br");
        Usuario u2 = new Usuario(2,"Saponácio","sapa@gmail.com.br");
        Usuario u3 = new Usuario(3,"Coníglia","cona@gmail.com.br");
        
        insert( new Score(1, u,1000) );
        insert( new Score(2, u2,500) );
        insert( new Score(3, u3,5000) );
        
    }
    
    
}
